
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jan 21 21:52:38 CST 2020
//----------------------------------------------------

package analizadores;

import arbol.Asignacion;
import arbol.Declaracion;
import arbol.Imprimir;
import arbol.If;
import arbol.Instruccion;
import arbol.Mientras;
import arbol.Operacion;
import arbol.Simbolo.Tipo;
import arbol.TablaDeSimbolos;
import arbol.DeclararAsignar;
import java.util.LinkedList;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jan 21 21:52:38 CST 2020
  */
public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\007\000\002\004\011" +
    "\000\002\004\005\000\002\004\007\000\002\004\006\000" +
    "\002\004\011\000\002\004\015\000\002\004\003\000\002" +
    "\005\004\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\005\005\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\006\005\000" +
    "\002\006\003\000\002\006\003\000\002\007\005\000\002" +
    "\007\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\016\003\011\024\005\025\004\026\012\027" +
    "\006\032\013\001\002\000\004\005\076\001\002\000\004" +
    "\005\066\001\002\000\004\005\047\001\002\000\020\002" +
    "\000\003\011\024\005\025\004\026\012\027\006\032\013" +
    "\001\002\000\022\002\ufffe\003\ufffe\010\ufffe\024\ufffe\025" +
    "\ufffe\026\ufffe\027\ufffe\032\ufffe\001\002\000\022\002\ufff6" +
    "\003\ufff6\010\ufff6\024\ufff6\025\ufff6\026\ufff6\027\ufff6\032" +
    "\ufff6\001\002\000\004\032\041\001\002\000\004\031\016" +
    "\001\002\000\004\002\015\001\002\000\004\002\001\001" +
    "\002\000\014\005\020\012\022\020\024\021\023\032\021" +
    "\001\002\000\014\004\040\011\026\012\027\013\031\014" +
    "\030\001\002\000\014\005\020\012\022\020\024\021\023" +
    "\032\021\001\002\000\024\004\uffed\006\uffed\011\uffed\012" +
    "\uffed\013\uffed\014\uffed\015\uffed\016\uffed\017\uffed\001\002" +
    "\000\014\005\020\012\022\020\024\021\023\032\021\001" +
    "\002\000\024\004\uffee\006\uffee\011\uffee\012\uffee\013\uffee" +
    "\014\uffee\015\uffee\016\uffee\017\uffee\001\002\000\024\004" +
    "\uffef\006\uffef\011\uffef\012\uffef\013\uffef\014\uffef\015\uffef" +
    "\016\uffef\017\uffef\001\002\000\024\004\ufff5\006\ufff5\011" +
    "\ufff5\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5" +
    "\001\002\000\014\005\020\012\022\020\024\021\023\032" +
    "\021\001\002\000\014\005\020\012\022\020\024\021\023" +
    "\032\021\001\002\000\014\005\020\012\022\020\024\021" +
    "\023\032\021\001\002\000\014\005\020\012\022\020\024" +
    "\021\023\032\021\001\002\000\024\004\ufff2\006\ufff2\011" +
    "\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2" +
    "\001\002\000\024\004\ufff1\006\ufff1\011\ufff1\012\ufff1\013" +
    "\ufff1\014\ufff1\015\ufff1\016\ufff1\017\ufff1\001\002\000\024" +
    "\004\ufff3\006\ufff3\011\ufff3\012\ufff3\013\031\014\030\015" +
    "\ufff3\016\ufff3\017\ufff3\001\002\000\024\004\ufff4\006\ufff4" +
    "\011\ufff4\012\ufff4\013\031\014\030\015\ufff4\016\ufff4\017" +
    "\ufff4\001\002\000\014\006\037\011\026\012\027\013\031" +
    "\014\030\001\002\000\024\004\ufff0\006\ufff0\011\ufff0\012" +
    "\ufff0\013\ufff0\014\ufff0\015\ufff0\016\ufff0\017\ufff0\001\002" +
    "\000\022\002\ufff9\003\ufff9\010\ufff9\024\ufff9\025\ufff9\026" +
    "\ufff9\027\ufff9\032\ufff9\001\002\000\006\004\043\031\042" +
    "\001\002\000\014\005\020\012\022\020\024\021\023\032" +
    "\021\001\002\000\022\002\ufffb\003\ufffb\010\ufffb\024\ufffb" +
    "\025\ufffb\026\ufffb\027\ufffb\032\ufffb\001\002\000\014\004" +
    "\045\011\026\012\027\013\031\014\030\001\002\000\022" +
    "\002\ufffa\003\ufffa\010\ufffa\024\ufffa\025\ufffa\026\ufffa\027" +
    "\ufffa\032\ufffa\001\002\000\022\002\uffff\003\uffff\010\uffff" +
    "\024\uffff\025\uffff\026\uffff\027\uffff\032\uffff\001\002\000" +
    "\014\005\020\012\022\020\024\021\023\032\021\001\002" +
    "\000\004\006\056\001\002\000\016\011\026\012\027\013" +
    "\031\014\030\016\053\017\052\001\002\000\014\005\020" +
    "\012\022\020\024\021\023\032\021\001\002\000\014\005" +
    "\020\012\022\020\024\021\023\032\021\001\002\000\014" +
    "\006\uffe8\011\026\012\027\013\031\014\030\001\002\000" +
    "\014\006\uffe9\011\026\012\027\013\031\014\030\001\002" +
    "\000\004\007\057\001\002\000\016\003\011\024\005\025" +
    "\004\026\012\027\006\032\013\001\002\000\020\003\011" +
    "\010\061\024\005\025\004\026\012\027\006\032\013\001" +
    "\002\000\024\002\ufff8\003\ufff8\010\ufff8\024\ufff8\025\ufff8" +
    "\026\ufff8\027\ufff8\030\062\032\ufff8\001\002\000\004\007" +
    "\063\001\002\000\016\003\011\024\005\025\004\026\012" +
    "\027\006\032\013\001\002\000\020\003\011\010\065\024" +
    "\005\025\004\026\012\027\006\032\013\001\002\000\022" +
    "\002\ufff7\003\ufff7\010\ufff7\024\ufff7\025\ufff7\026\ufff7\027" +
    "\ufff7\032\ufff7\001\002\000\016\005\020\012\022\020\024" +
    "\021\023\022\071\032\021\001\002\000\016\006\uffea\011" +
    "\026\012\027\013\031\014\030\015\uffea\001\002\000\006" +
    "\006\072\015\073\001\002\000\006\006\uffeb\015\uffeb\001" +
    "\002\000\004\004\075\001\002\000\016\005\020\012\022" +
    "\020\024\021\023\022\071\032\021\001\002\000\006\006" +
    "\uffec\015\uffec\001\002\000\022\002\ufffd\003\ufffd\010\ufffd" +
    "\024\ufffd\025\ufffd\026\ufffd\027\ufffd\032\ufffd\001\002\000" +
    "\014\005\020\012\022\020\024\021\023\032\021\001\002" +
    "\000\004\006\100\001\002\000\004\007\101\001\002\000" +
    "\016\003\011\024\005\025\004\026\012\027\006\032\013" +
    "\001\002\000\020\003\011\010\103\024\005\025\004\026" +
    "\012\027\006\032\013\001\002\000\022\002\ufffc\003\ufffc" +
    "\010\ufffc\024\ufffc\025\ufffc\026\ufffc\027\ufffc\032\ufffc\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\010\002\013\003\006\004\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\045\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\016\001\001\000\002\001\001\000" +
    "\004\005\035\001\001\000\002\001\001\000\004\005\024" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\034\001\001\000\004\005\033\001\001" +
    "\000\004\005\032\001\001\000\004\005\031\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\043\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\005\050\007\047\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\054\001\001\000\004\005" +
    "\053\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\057\004\007\001\001\000\004\004" +
    "\045\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\063\004\007\001\001\000\004\004\045\001\001\000" +
    "\002\001\001\000\006\005\066\006\067\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\005\066\006\073\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\005\050\007\076\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\101\004\007" +
    "\001\001\000\004\004\045\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Variable en la que se almacena el arbol de sintaxis abstracta que se 
     * genera luego del analisis sintáctico.
     */
    public LinkedList<Instruccion> AST;
    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
            System.err.println("Error Sintáctico en la Línea " + (s.left) +" Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 
    /**
     * Método al que se llama en el momento en que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
            System.err.println("Error síntactico irrecuperable en la Línea " + (s.left)+ " Columna "+s.right+". Componente " + s.value + " no reconocido."); 
    }  
    /**
     * Método que devuelve el AST que se generó después de realizar el análisis sintáctico. 
     * @return árbol de sintaxis abstacta que será utilizado posteriormente en la ejecución.
     */
    public LinkedList<Instruccion> getAST() {
        return AST;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion_logica ::= expresion_numerica MENQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.MENOR_QUE);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion_logica ::= expresion_numerica MAYQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.MAYOR_QUE);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion_cadena ::= expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion_cadena ::= CADENA 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.CADENA);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion_cadena ::= expresion_cadena CONCAT expresion_cadena 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.CONCATENACION);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion_numerica ::= IDENTIFICADOR 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.IDENTIFICADOR);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion_numerica ::= DECIMAL 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(new Double(a));
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion_numerica ::= ENTERO 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(new Double(a));
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion_numerica ::= PARIZQ expresion_numerica PARDER 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion_numerica ::= expresion_numerica DIVIDIDO expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.DIVISION);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion_numerica ::= expresion_numerica POR expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.MULTIPLICACION);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion_numerica ::= expresion_numerica MENOS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.RESTA);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion_numerica ::= expresion_numerica MAS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.SUMA);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion_numerica ::= MENOS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.NEGATIVO);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // instruccion ::= error 
            {
              Instruccion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // instruccion ::= RIF PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER RELSE LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Instruccion> c = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new If(a,b,c);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instruccion ::= RIF PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new If(a,b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruccion ::= IDENTIFICADOR IGUAL expresion_numerica PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new Asignacion(a,b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= RNUMERO IDENTIFICADOR IGUAL expresion_numerica PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new DeclararAsignar(a,Tipo.NUMERO,b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= RNUMERO IDENTIFICADOR PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new Declaracion(a,Tipo.NUMERO);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= RMIENTRAS PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT=new Mientras(a,b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= RIMPRIMIR PARIZQ expresion_cadena PARDER PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		RESULT=new Imprimir(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new LinkedList<>(); RESULT.add(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=a; RESULT.add(b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= instrucciones 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
    //se guarda el AST, que es la lista principal de instrucciones en la variable
    //AST que se definió dentro del parser
    parser.AST=a;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

