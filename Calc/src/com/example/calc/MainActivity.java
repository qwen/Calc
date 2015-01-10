package com.example.calc;



import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	private Button BtZero;
	private Button BtOne;
	private Button BtTwo;
	private Button BtThree;
	private Button BtFour;
	private Button BtFive;
	private Button BtSex;
	private Button BtSeven;
	private Button BtEight;
	private Button BtNine;
	
	private Button BtC;
	private Button BtUmn;
	private Button BtDel;
	private Button BtDell;
	private Button BtPlus;
	private Button BtMinus;
	private Button BtRavn;
	
	private EditText  EditText;
	
	private int firstValue = 0;
	private int secondValue = 0;
	private String operation = "+";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// получим ссылки на контролллы
		BtZero = (Button)findViewById(R.id.BtZero);
		BtOne = (Button)findViewById(R.id.BtOne);
		BtTwo = (Button)findViewById(R.id.BtTwo);
		BtThree = (Button)findViewById(R.id.BtThree);
		BtFour = (Button)findViewById(R.id.BtFour);
		BtFive = (Button)findViewById(R.id.BtFive);
		BtSex = (Button)findViewById(R.id.BtSex);
		BtSeven = (Button)findViewById(R.id.BtSeven);
		BtEight = (Button)findViewById(R.id.BtEight);
		BtNine = (Button)findViewById(R.id.BtNine);
		
		BtC = (Button)findViewById(R.id.BtC);
		BtUmn = (Button)findViewById(R.id.BtUmn);
		BtDel = (Button)findViewById(R.id.BtDel);
		BtDell = (Button)findViewById(R.id.BtDell);
		BtPlus = (Button)findViewById(R.id.BtPlus);
		BtMinus = (Button)findViewById(R.id.BtMinus);
		BtRavn = (Button)findViewById(R.id.BtRavn);
		
		EditText = (EditText)findViewById(R.id.EditText);
		
		
		//0
		OnClickListener aBtZero = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"0");
				
			}
		};
		
		BtZero.setOnClickListener(aBtZero);
		
		
		//1
		OnClickListener aBtOne =new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"1");
				
			}
		};
		
		BtOne.setOnClickListener(aBtOne);
		
		
		//2
		OnClickListener aBtTwo =new OnClickListener() {
					
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"2");
						
			}
		};
				
		BtTwo.setOnClickListener(aBtTwo);
				
		//3
		OnClickListener aBtThree =new OnClickListener() {
					
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"3");
						
				}
		};
				
		BtThree.setOnClickListener(aBtThree);
				
		//4
		OnClickListener aBtFour =new OnClickListener() {
					
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"4");
						
			}
		};
				
		BtFour.setOnClickListener(aBtFour);
		
		//5
		OnClickListener aBtFive =new OnClickListener() {
							
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"5");
								
			}
		};
						
		BtFive.setOnClickListener(aBtFive);
				
		//6
		OnClickListener aBtSex =new OnClickListener() {
									
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"6");
										
			}
		};
								
		BtSex.setOnClickListener(aBtSex);
		
		//7
		OnClickListener aBtSeven =new OnClickListener() {
									
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"7");
										
			}
		};
								
		BtSeven.setOnClickListener(aBtSeven);
		
		//8
		OnClickListener aBtEight =new OnClickListener() {
											
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"8");
												
			}
		};
										
		BtEight.setOnClickListener(aBtEight);
				
		//9
		OnClickListener aBtNine =new OnClickListener() {
											
			@Override
			public void onClick(View v) {
				EditText.setText(EditText.getText()+"9");
												
			}
		};
										
		BtNine.setOnClickListener(aBtNine);
		
		
		
		
		
		
		//Dell
		OnClickListener aBtDell = new OnClickListener() {
													
			@Override
			public void onClick(View v) {
				Editable temp = EditText.getText();
				EditText.setText(temp.subSequence(0,temp.length()-1));
														
			}
		};
												
		BtDell.setOnClickListener(aBtDell);	
		
		
		//C
		OnClickListener aBtC = new OnClickListener() {
															
			@Override
			public void onClick(View v) {
				
				EditText.setText("");
																
			}
		};
														
		BtC.setOnClickListener(aBtC);	
		
		
		
		//+
		OnClickListener aBtPlus = new OnClickListener() {
																	
			@Override
			public void onClick(View v) {					
				 firstValue = Integer.parseInt(EditText.getText().toString());
				 EditText.setText("");
	                operation = "+";																	
			}
		};
																
		BtPlus.setOnClickListener(aBtPlus);		
		
		
		//-
		OnClickListener aBtMinus = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				firstValue = Integer.parseInt(EditText.getText().toString());
				 EditText.setText("");
	                operation = "-";
			}
		};
																
		BtMinus.setOnClickListener(aBtMinus);	
		
		//*
		OnClickListener aBtUmn = new OnClickListener() {
					
			@Override
			public void onClick(View v) {
				firstValue = Integer.parseInt(EditText.getText().toString());
				 EditText.setText("");
			         operation = "*";
			}
		};
																		
		BtUmn.setOnClickListener(aBtUmn);
		
		///
		OnClickListener aBtDel = new OnClickListener() {
							
			@Override
			public void onClick(View v) {
				firstValue = Integer.parseInt(EditText.getText().toString());
				 EditText.setText("");
					 operation = "/";
			}
		};
																				
		BtDel.setOnClickListener(aBtDel);
		
		//=
		OnClickListener aBtRavn = new OnClickListener() {
																			
			@Override
			public void onClick(View v) {
								
				secondValue = Integer.parseInt(EditText.getText().toString());
                if("+".equals(operation)){
                	EditText.setText(firstValue + secondValue + "");
                }   
                if("-".equals(operation)){
                	EditText.setText(firstValue - secondValue + "");
                }  
                if("*".equals(operation)){
                	EditText.setText(firstValue * secondValue + "");
                }  
                if("/".equals(operation)){
                	EditText.setText(firstValue / secondValue + "");
                }  
                firstValue = 0;
                operation = "+";																
			}
                
		};
																		
		BtRavn.setOnClickListener(aBtRavn);			
	}
		
	

	

}
