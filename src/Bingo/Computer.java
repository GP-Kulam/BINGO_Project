/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo;

import java.util.Random;

/**
 *
 * @author GP Kulam
 */
public class Computer {
    
    //A stack that stores the distinct random numbers
    int stack[] = new int[25];
    int top = 0;
    //a 2D array for storing the values on all buttons in order
    int Array[][] = new int[5][5];
    int x; //stores the random number generated in function giverandom()
    int BingoCount=0;
    int BArray[][] = new int[5][5];
    public void push(int x)
    {
        if(top>=25)
        {
            return;
        }
        else
        {
            stack[top++] = x;
        }
    }
    public void pop()
    {
        --top;
    }
   
    //a function to set distict random numbers to all the buttons on gameboard
    public int giveRandom()
    {
        
        Random rad = new Random();
        x = rad.nextInt(25)+1;
        
        for(int i=0; i<top; i++)
        {
            if(x==stack[i])
            {
                return giveRandom();
            }      
        }
        push(x);
        return x;
        
    }
    
    //function to store the values on buttons in an array
    public void StoreValuesInarray()
    {
        int y=0; //variable for accessing the stack 
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                Array[i][j] = stack[y];
                BArray[i][j] = Array[i][j];
                y++;
            }
            System.out.println();
        }
    }
    
    public void display()
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print("   "+Array[i][j]);
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    
    public int EnterOnBoard(int Entry)
    {
        for(int i=0; i<5; i++)
         {
             for(int j=0; j<5; j++)
             {
                 if(Entry == Array[i][j])
                     Array[i][j] =0;
             }
         }//end of for
         
         
         for(int i=0; i<5; i++)
         {
             for(int j=0; j<5; j++)
             {
                 System.out.print("   "+Array[i][j]);
             }
             System.out.println();
            
             
         }//end of for
        
        int EqualityRCount=0;
        int EqualityCCount=0;
        int EqualityDCount=0;
        
        /**
         * Element [0 0]
         */
        if(Entry == BArray[0][0])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[0][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][0] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element 1
        
        /**
         * Element [0 1]
         */
        if(Entry == BArray[0][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[0][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [0,1]
        
        /**
         * Element [0 2]
         */
        if(Entry == BArray[0][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[0][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][2] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [0,2]
        
        /**
         * Element [0 3]
         */
        if(Entry == BArray[0][3])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[0][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][3] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [0,3]

        /**
         * Element [0 4]
         */
        if(Entry == BArray[0][4])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[0][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4-i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [0,4]

        
        /**
         * Element [1 0]
         */
        if(Entry == BArray[1][0])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[1][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][0] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [1,0]

        
        
        /**
         * Element [1 1]
         */
        if(Entry == BArray[1][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[1][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [1,1]
        
        /**
         * Element [1 2]
         */
        if(Entry == BArray[1][2])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[1][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][2] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [1,2]

        
        /**
         * Element [1 3]
         */
        if(Entry == BArray[1][3])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[1][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][3] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4-i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [1,3]

        
        
        /**
         * Element [1 4]
         */
        if(Entry == BArray[1][4])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[1][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [1,4]
        
        /**
         * Element [2 0]
         */
        if(Entry == BArray[2][0])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[2][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][0] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [2,0]

        
        
        /**
         * Element [2 1]
         */
        if(Entry == BArray[2][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[2][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [2,1]
        
        /**
         * Element [2 2]
         */
        if(Entry == BArray[2][2])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[2][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][2] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4-i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [2,2]
        
        
        /**
         * Element [2 3]
         */
        if(Entry == BArray[2][3])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[2][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][3] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [2,3]
        
        
        /**
         * Element [2 4]
         */
        if(Entry == BArray[2][4])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[2][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [2,4]
        
        /**
         * Element [3 0]
         */
        if(Entry == BArray[3][0])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[3][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][0] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [3 0]
        
        
        /**
         * Element [3 1]
         */
        if(Entry == BArray[3][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[3][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4-i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [3 1]
        
        /**
         * Element [3 2]
         */
        if(Entry == BArray[3][2])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[3][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][2] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [3 2]
        
        
        /**
         * Element [3 3]
         */
        if(Entry == BArray[3][3])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[3][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][3] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//End for element [3 3]
        
        /**
         * Element [3 4]
         */
        if(Entry == BArray[3][4])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[3][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//End for element [3 4]
        
        
        /**
         * Element [4 0]
         */
        if(Entry == BArray[4][0])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[4][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][0] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4-i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//end for element [4 0]
        
        
        /**
         * Element [4 1]
         */
        if(Entry == BArray[4][1])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[4][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][1] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//end for element [4 1]
        
        
        /**
         * Element [4 2]
         */
        if(Entry == BArray[4][2])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[4][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][2] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//end for element [4 2]
        
        /**
         * Element [4 3]
         */
        if(Entry == BArray[4][3])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[4][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][3] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            
        }//end for element [4 3]
        
        /**
         * Element [4 4]
         */
        if(Entry == BArray[4][4])
        {
            
            for(int i = 0; i<5; i++)
            {
                if(Array[4][i] == 0)
                {
                    EqualityRCount++;
                    if(EqualityRCount == 5)
                    {
                        BingoCount++;
                        EqualityRCount =0;
                    }
                }
                else
                    break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][4] == 0)
                {
                    EqualityCCount++;
                    if(EqualityCCount == 5)
                    {
                        BingoCount++;
                        EqualityCCount =0;
                    }
                }
                else
                     break;
            }//end of for
            for(int i = 0; i<5; i++)
            {
                if(Array[i][i] == 0)
                {
                    EqualityDCount++;
                    if(EqualityDCount == 5)
                    {
                        BingoCount++;
                        EqualityDCount =0;
                    }
                }
                else
                     break;
            }//end of for
        }//end for element [4 4]
        
        System.out.println();
        System.out.println("BingoCount: "+BingoCount);
        return BingoCount;   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
       Computer c = new Computer();
       
       for(int i=0; i<25; i++)
       {
           c.giveRandom();
       }
       c.StoreValuesInarray();
       c.display();
    }
    
}
