
public class Pi {

	public static void main(String[] args) {
		double pi = 0;
			for (long i = 1;i <=922337203; i++)
			{
				pi = pi + (4/((2*i-1)*Math.pow(-1, (i + 1))));
				System.out.println(pi);
			}
			for (long i = 1;i <=922337203; i++)
			{
				pi = pi + (4/((2*(i + 922337203) -1)*Math.pow(-1, ((i + 922337203) + 1))));
				System.out.println(pi);
			}
			for (long i = 1;i <=922337203; i++)
			{
				pi = pi + (4/((2*(i + (2*922337203)) -1)*Math.pow(-1, ((i + (2*922337203)) + 1))));
				System.out.println(pi);
			}
			System.out.println(pi);
	}

}
