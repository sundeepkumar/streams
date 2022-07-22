package streams;

public class Item implements Comparable<Item> {

    private int id;
    private Integer price;
    private Integer category;

    public Item(int id, Integer price , Integer category) {
        this.id = id;
        this.price = price;
        this.category = category;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", category=" + category + "]";
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	// Standard getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		
		return this.getPrice().compareTo(o.getPrice());
	}

   
}
