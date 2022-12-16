package com.mealkit.product;

public class Criteria {
	
	/* �쁽�옱 �럹�씠吏� 踰덊샇 */
    private int pageNum;
    
    /* �럹�씠吏� �몴�떆 媛쒖닔 */
    private int amount;
    
    /* 寃��깋 ���엯 */
    private String type;
    
    /* 寃��깋 �궎�썙�뱶 */
    private String keyword;
    
    /* Criteria �깮�꽦�옄 */
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
    
    /* Criteria 湲곕낯 �깮�꽦�옄 */
    public Criteria(){
        this(1,10);
    }
    
    /* 寃��깋 ���엯 �뜲�씠�꽣 諛곗뿴 蹂��솚 */
    public String[] getTypeArr() {
        return type == null? new String[] {}:type.split("");
    }

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", type=" + type + ", keyword=" + keyword + "]";
	}
    
    
    
    
    
    
}
