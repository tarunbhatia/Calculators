package com.tarunbhatia.financialcalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorFragment extends Fragment implements
		View.OnClickListener {

	// Empty Constructor
	public CalculatorFragment() {
		oneButton = twoButton = threeButton = fourButton = fiveButton = sixButton = null;
		sevenButton = eightButton = nineButton = zeroButton = plusButton = minusButton = equalButton = clearButton = null;
		divButton = removeButton = multiplyButton = null;
	}

	Button oneButton = null;
	Button twoButton = null;
	Button threeButton = null;
	Button fourButton = null;
	Button fiveButton = null;
	Button sixButton = null;
	Button sevenButton = null;
	Button eightButton = null;
	Button nineButton = null;
	Button zeroButton = null;
	Button plusButton = null;
	Button minusButton = null;
	Button equalButton = null;
	Button clearButton = null;
	Button divButton = null;
	Button removeButton = null;
	Button multiplyButton = null;

	@Override
	public void onActivityCreated(Bundle savedInstanceBundle) {
		super.onActivityCreated(savedInstanceBundle);
		oneButton = (Button) getActivity().findViewById(R.id.button1);
		oneButton.setOnClickListener(this);

		twoButton = (Button) getActivity().findViewById(R.id.button2);
		twoButton.setOnClickListener(this);

		threeButton = (Button) getActivity().findViewById(R.id.button3);
		threeButton.setOnClickListener(this);

		fourButton = (Button) getActivity().findViewById(R.id.button4);
		fourButton.setOnClickListener(this);

		fiveButton = (Button) getActivity().findViewById(R.id.button5);
		fiveButton.setOnClickListener(this);

		sixButton = (Button) getActivity().findViewById(R.id.button6);
		sixButton.setOnClickListener(this);

		sevenButton = (Button) getActivity().findViewById(R.id.button7);
		sevenButton.setOnClickListener(this);

		eightButton = (Button) getActivity().findViewById(R.id.button8);
		eightButton.setOnClickListener(this);

		nineButton = (Button) getActivity().findViewById(R.id.button9);
		nineButton.setOnClickListener(this);

		zeroButton = (Button) getActivity().findViewById(R.id.button0);
		zeroButton.setOnClickListener(this);

		plusButton = (Button) getActivity().findViewById(R.id.buttonPlus);
		plusButton.setOnClickListener(this);

		minusButton = (Button) getActivity().findViewById(R.id.buttonMinus);
		minusButton.setOnClickListener(this);

		multiplyButton = (Button) getActivity().findViewById(R.id.buttonMulti);
		multiplyButton.setOnClickListener(this);

		divButton = (Button) getActivity().findViewById(R.id.buttonDiv);
		divButton.setOnClickListener(this);

		clearButton = (Button) getActivity().findViewById(R.id.buttonClear);
		clearButton.setOnClickListener(this);

		removeButton = (Button) getActivity().findViewById(R.id.buttonRemove);
		removeButton.setOnClickListener(this);

		equalButton = (Button) getActivity().findViewById(R.id.buttonEqual);
		equalButton.setOnClickListener(this);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public void onClick(View v) {
		Float num1, num2, result = (float) 0;
		TextView firstInput = (TextView) getActivity().findViewById(
				R.id.firstInput);
		TextView secondInput = (TextView) getActivity().findViewById(
				R.id.secondInput);
		TextView curOperator = (TextView) getActivity().findViewById(
				R.id.currentOperatorTextView);
		switch (v.getId()) {

		case R.id.button1:
			secondInput.setText(secondInput.getText() + "1");
			break;
		case R.id.button2:
			secondInput.setText(secondInput.getText() + "2");
			break;
		case R.id.button3:
			secondInput.setText(secondInput.getText() + "3");
			break;
		case R.id.button4:
			secondInput.setText(secondInput.getText() + "4");
			break;
		case R.id.button5:
			secondInput.setText(secondInput.getText() + "5");
			break;
		case R.id.button6:
			secondInput.setText(secondInput.getText() + "6");
			break;
		case R.id.button7:
			secondInput.setText(secondInput.getText() + "7");
			break;
		case R.id.button8:
			secondInput.setText(secondInput.getText() + "8");
			break;
		case R.id.button9:
			secondInput.setText(secondInput.getText() + "9");
			break;
		case R.id.button0:
			secondInput.setText(secondInput.getText() + "0");
			break;
		case R.id.buttonRemove:
			if (secondInput.getText().length() > 0) {
				if (secondInput.getText().length() == 1) {
					secondInput.setText("");
				} else if (secondInput.getText().toString().endsWith(".0")) {
					secondInput
							.setText(secondInput
									.getText()
									.toString()
									.substring(
											0,
											secondInput.getText().toString()
													.length() - 3));
				} else {

					secondInput
							.setText(secondInput
									.getText()
									.toString()
									.substring(
											0,
											secondInput.getText().toString()
													.length() - 1));
				}
			}
			break;
		case R.id.buttonPlus:
			if (secondInput.getText().length() == 0) {
				Toast.makeText(getActivity(), "Need more Information",
						Toast.LENGTH_SHORT).show();
				curOperator.setText("+");
				break;
			}

			// If this is the first input, push it to the first Text Window
			// Clean up the second text window
			if (firstInput.getText().length() == 0) {
				firstInput.setText(secondInput.getText());
				secondInput.setText("");
			}
			curOperator.setText("+");
			break;
		case R.id.buttonMinus:
			if (secondInput.getText().length() == 0) {
				Toast.makeText(getActivity(), "Need more Information",
						Toast.LENGTH_SHORT).show();
				curOperator.setText("-");
				break;
			}

			// If this is the first input, push it to the first Text Window
			// Clean up the second text window
			if (firstInput.getText().length() == 0) {
				firstInput.setText(secondInput.getText());
				secondInput.setText("");
			}
			curOperator.setText("-");
			break;
		case R.id.buttonMulti:
			if (secondInput.getText().length() == 0) {
				Toast.makeText(getActivity(), "Need more Information",
						Toast.LENGTH_SHORT).show();
				curOperator.setText("*");
				break;
			}

			// If this is the first input, push it to the first Text Window
			// Clean up the second text window
			if (firstInput.getText().length() == 0) {
				firstInput.setText(secondInput.getText());
				secondInput.setText("");
			}
			curOperator.setText("*");
			break;
		case R.id.buttonDiv:
			if (secondInput.getText().length() == 0) {
				Toast.makeText(getActivity(), "Need more Information",
						Toast.LENGTH_SHORT).show();
				curOperator.setText("/");
				break;
			}

			// If this is the first input, push it to the first Text Window
			// Clean up the second text window
			if (firstInput.getText().length() == 0) {
				firstInput.setText(secondInput.getText());
				secondInput.setText("");
			}
			curOperator.setText("/");
			break;
		case R.id.buttonClear:
			secondInput.setText("");
			firstInput.setText("");
			curOperator.setText("");
			break;
		case R.id.buttonEqual:
			try {
				if (firstInput.getText().toString().length() != 0
						&& secondInput.getText().toString().length() != 0
						&& curOperator.getText().toString().length() != 0) {

					num1 = Float.parseFloat(firstInput.getText().toString());
					num2 = Float.parseFloat(secondInput.getText().toString());
					if (curOperator.getText().equals("+")) {
						result = num1 + num2;
						secondInput.setText(result.toString());
						firstInput.setText("");
						curOperator.setText("");
					} else if (curOperator.getText().equals("-")) {
						result = num1 - num2;
						secondInput.setText(result.toString());
						firstInput.setText("");
						curOperator.setText("");
					} else if (curOperator.getText().equals("*")) {
						result = num1 * num2;
						secondInput.setText(result.toString());
						firstInput.setText("");
						curOperator.setText("");
					} else if (curOperator.getText().equals("/")) {
						result = num1 / num2;
						secondInput.setText(result.toString());
						firstInput.setText("");
						curOperator.setText("");
					}
				}
				break;
			} catch (Exception e) {
				Toast.makeText(getActivity(),
						"Improper Use of Simple Calculator", Toast.LENGTH_SHORT)
						.show();
				firstInput.setText("");
				curOperator.setText("");
				secondInput.setText("");
			}
		default:
			break;
		}
	}
}
