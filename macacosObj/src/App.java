import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        long start = System.nanoTime();
        
            try (BufferedReader br = new BufferedReader(new FileReader("caso0800.txt"))) {
                String linha1 = br.readLine();
                int numRodadas = Integer.parseInt(linha1.substring(linha1.indexOf(" ") + 1, linha1.indexOf(" ", linha1.indexOf(" ") + 1)));
                System.out.println(numRodadas);
                List<String> lines = new ArrayList<>();
                String line;
                List<Macacos> macacos = new ArrayList<>();
                
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
                for(int i = 0; i<lines.size();i++){
                    String[] tokens = lines.get(i).split(" ");
                    int macaco = Integer.parseInt(tokens[1]);
                    int nroCocos = Integer.parseInt(tokens[9]);
                    int destinoPares = Integer.parseInt(tokens[4]);
                    int destinoImpares = Integer.parseInt(tokens[7]);
                    int qtdPares = 0, qtdImpares = 0;
                    for(int j = 11; j<tokens.length;j++){
                        if(Integer.parseInt(tokens[j])%2==0){
                            qtdPares++;
                        } else{
                            qtdImpares++;
                        }
                    }
                    macacos.add(new Macacos(macaco, nroCocos, destinoPares, destinoImpares, qtdPares, qtdImpares));
                }
                while(numRodadas!=0){   
                    for(Macacos m : macacos){
                        //add cocos pares
                        macacos.get(m.getDestinoPar()).addCocosPar(m.getNroDestinoPar());

                        //impar
                        macacos.get(m.getDestinoImpar()).addCocosImpar(m.getNroDestinoImpar());
                        m.removeCocos();
                    }
                    
                    numRodadas--;
                }
                System.out.println("LOL");
                System.out.println("LOL");


                
                int aux = Integer.MIN_VALUE;
                int aux1 = 0;
                for(Macacos m : macacos){
                    if(m.getNroCocos() > aux){
                        aux = m.getNroCocos();
                        aux1 = m.getId();
                    }
                }
                System.out.println("Macaco: "+aux1+" é o vencedor com: "+aux+" cocos!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            long duration = (System.nanoTime() - start)/1000000;
            System.out.println("Tempo de execução do algoritmo: "+duration+ "ms");
            //GIT COMMIT 2
        }     
    }
