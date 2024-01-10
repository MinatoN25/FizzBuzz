package com.fizzbuzz.dto;

import java.util.Objects;

public class FizzBuzzDTO {
	
	private int a;
	private int b;
	private int limit;
	private String fizz;
	private String buzz;
	private Integer hitCount;
	
	
	public Integer getHitCount() {
		return hitCount;
	}
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getFizz() {
		return fizz;
	}
	public void setFizz(String fizz) {
		this.fizz = fizz;
	}
	public String getBuzz() {
		return buzz;
	}
	public void setBuzz(String buzz) {
		this.buzz = buzz;
	}
	public FizzBuzzDTO(int a, int b, int limit, String fizz, String buzz) {
		super();
		this.a = a;
		this.b = b;
		this.limit = limit;
		this.fizz = fizz;
		this.buzz = buzz;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b, buzz, fizz, limit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FizzBuzzDTO other = (FizzBuzzDTO) obj;
		return a == other.a && b == other.b && Objects.equals(buzz, other.buzz) && Objects.equals(fizz, other.fizz)
				&& limit == other.limit;
	}
	@Override
	public String toString() {
		return "FizzBuzzDTO [a=" + a + ", b=" + b + ", limit=" + limit + ", fizz=" + fizz + ", buzz=" + buzz
				+ ", hitCount=" + hitCount + "]";
	}
	
	
	

}
