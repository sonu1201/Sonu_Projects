
public class DuplicateChartrOccurance {

	public static void main(String[] args) {
			
			String str = "JACKANDJILL"; 
			String st1 = str.toLowerCase();
			
			char[] chstr = st1.toCharArray();
			int length = chstr.length;
			
			for (int i=0; i < length; i++) {
				int count = 1; 
				
				for (int j=i+1; j< length; j++) {
					
					if (chstr[i] == chstr[j]) {
						count++;
						chstr[j]=0;	
						
				}
			}if(chstr[i] != 0 && count > 1 ) // if we remove count then number of occurrences of a number occurs
			{
				System.out.println(chstr[i] + " :occurs " + count + " time");
			}	
			

		}

		}

	}


