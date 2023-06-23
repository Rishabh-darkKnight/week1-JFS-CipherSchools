public class Test0 {

    public Test0() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Amazon customer= new Amazon();

        float payableAmount = customer. Transaction(1000);

        System.out.println("Total Payable "+payableAmount);
    }
}
class Amazon{
    float Transaction(float ant) {
        GPay gpayObj = new GPay();
        gpayObj.setTxnCharge(0.07f);
        float totalAmount= ant+ (ant* gpayObj.getTxnCharge());
        return totalAmount;

    }
}

class GPay{
    private float txnCharge=0.05f;

    public void setTxnCharge(float newCharge) {



        if (newCharge<0.05f) {

            System.out.println("Invalid TxnCharge");
            return;

        }
        txnCharge=newCharge;
    }
    public float getTxnCharge() {
        return txnCharge;




    }

}