 package club.dizy.jsit.visitor.structure;
 
 import club.dizy.jsit.node.SimpleNode;
 import club.dizy.jsit.token.Token;
 import club.dizy.jsit.token.TokenList;
 import club.dizy.jsit.visitor.Visitor;
 
 public class ASTNestedClassDeclarationVisitor
   extends Visitor
 {
   public ASTNestedClassDeclarationVisitor(SimpleNode node, Object data)
   {
     super(node, data);
   }
   
   public void before()
   {
     startLineWith("");
     String[] availables = { "static", "abstract", "public", "protected", "private" };
     int i = -1;
     while (((Token)this.tokens.get(++i)).in(availables)) {
       add(((Token)this.tokens.get(i)).image + " ");
     }
   }
   
   public void after() {}
 }




