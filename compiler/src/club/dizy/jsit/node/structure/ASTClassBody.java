 package club.dizy.jsit.node.structure;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTClassBody
   extends SimpleNode
 {
   public ASTClassBody(int id)
   {
     super(id);
   }
   
   public ASTClassBody(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTClassBody(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTClassBody(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




