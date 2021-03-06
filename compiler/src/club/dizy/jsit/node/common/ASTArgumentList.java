 package club.dizy.jsit.node.common;
 
 import club.dizy.jsit.JsitParser;
 import club.dizy.jsit.node.Node;
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.visitor.JsitParserVisitor;
 
 public class ASTArgumentList
   extends SimpleNode
 {
   public ASTArgumentList(int id)
   {
     super(id);
   }
   
   public ASTArgumentList(JsitParser p, int id)
   {
     super(p, id);
   }
   
   public static Node jjtCreate(int id)
   {
     return new ASTArgumentList(id);
   }
   
   public static Node jjtCreate(JsitParser p, int id)
   {
     return new ASTArgumentList(p, id);
   }
   
   public Object jjtAccept(JsitParserVisitor visitor, Object data)
   {
     return 
       visitor.visit(this, data);
   }
 }




