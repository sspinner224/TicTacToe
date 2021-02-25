/*
@author Sam Spinner
date created: 2/23/21
date modified: 2/23/21
 */

package com.hfad.tictactoe;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class PlayGame extends AppCompatActivity {

    private TextView winMessage;
    private TextView winMessage2;

    private int roundCount;

    private int[][] board = new int[5][5];

    private int row = 0;
    private int col = 0;

    private int currentState = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);


        Intent intent = getIntent();
        String nameText = intent.getStringExtra(MainActivity.EXTRA_NAME);

    }

    public void onButtonClicked(View v) {
            do {

            if (!((Button) v).getText().toString().equals("")) {
                return;
            }

            ((Button) v).setText("X");
    // SET ROW AND COL FOR THE BOARD ARRAY CORRESPONDING WITH THE BUTTON CLICKED
            switch (v.getId()) {
                case R.id.button00: {
                    row = 0;
                    col = 0;
                }
                break;
                case R.id.button01: {
                    row = 0;
                    col = 1;
                }
                break;
                case R.id.button02: {
                    row = 0;
                    col = 2;
                }
                break;
                case R.id.button03: {
                    row = 0;
                    col = 3;
                }
                break;
                case R.id.button04: {
                    row = 0;
                    col = 4;
                }
                break;
                case R.id.button10: {
                    row = 1;
                    col = 0;
                }
                break;
                case R.id.button11: {
                    row = 1;
                    col = 1;
                }
                break;
                case R.id.button12: {
                    row = 1;
                    col = 2;
                }
                break;
                case R.id.button13: {
                    row = 1;
                    col = 3;
                }
                break;
                case R.id.button14: {
                    row = 1;
                    col = 4;
                }
                break;
                case R.id.button20: {
                    row = 2;
                    col = 0;
                }
                break;
                case R.id.button21: {
                    row = 2;
                    col = 1;
                }
                break;
                case R.id.button22: {
                    row = 2;
                    col = 2;
                }
                break;
                case R.id.button23: {
                    row = 2;
                    col = 3;
                }
                break;
                case R.id.button24: {
                    row = 2;
                    col = 4;
                }
                break;
                case R.id.button30: {
                    row = 3;
                    col = 0;
                }
                break;
                case R.id.button31: {
                    row = 3;
                    col = 1;
                }
                break;
                case R.id.button32: {
                    row = 3;
                    col = 2;
                }
                break;
                case R.id.button33: {
                    row = 3;
                    col = 3;
                }
                break;
                case R.id.button34: {
                    row = 3;
                    col = 4;
                }
                break;
                case R.id.button40: {
                    row = 4;
                    col = 0;
                }
                break;
                case R.id.button41: {
                    row = 4;
                    col = 1;
                }
                break;
                case R.id.button42: {
                    row = 4;
                    col = 2;
                }
                break;
                case R.id.button43: {
                    row = 4;
                    col = 3;
                }
                break;
                case R.id.button44: {
                    row = 4;
                    col = 4;
                }
                break;


            }
            // UPDATE BOARD ARRAY FOR X MOVE
            board[row][col] = 1;
            //INCREMENT ROUND COUNT
            roundCount++;
            // SET CURRENT STATE TO THE RETURN VAL OF CHECK WIN METHOD
            currentState = checkForWin();

            Button newButton = findViewById(R.id.button00);

            winMessage = findViewById(R.id.win_message);
            winMessage2 = findViewById(R.id.win_message2);

            //IF THERE IS A WIN/TIE, DISPLAY WIN/TIE MESSAGE

            if (currentState == 2) {
                winMessage.setText("  X");
                winMessage2.setText("Wins!");
                roundCount = 0;
                break;
            } else if (currentState == 3) {
                winMessage.setText("  O");
                winMessage2.setText("Wins!");
                roundCount = 0;
                break;
            } else if (currentState == 1) {
                winMessage.setText("Tie!");
                roundCount = 0;
                break;
            }


            boolean valid = false; // TRUE WHEN RANDOM NUMBER IS VALID
            int upperbound = 24; // ONLY GENERATE NUMBERS FROM 0-24
            int intRand; // TO STORE RANDOM INTEGER

            // LOOP UNTIL VALID NUMBER IS STORED
            do {
                Random randVal = new Random(); // CREATE INSTANCE OF RANDOM CLASS
                intRand = randVal.nextInt(upperbound); // STORE RANDOM NUMBER IN INTRAND

                row = (int) intRand / 5; // GET ROW
                col = intRand % 5; // GET COLUMN

                // NUMBER IS VALID IF CELL IS EMPTY
                if (board[row][col] == 0) {
                    valid = true;
                }

                // LOOP UNTIL RANDOM NUMBER IS VALID
            } while (!valid);

            //ASSIGNS A BUTTON WITH TEXT BASED ON THE RANDOM NUMBER GENERATED

            switch (intRand) {
                case 0: {
                    newButton = findViewById(R.id.button00);
                    findViewById(R.id.button00);
                    newButton.setText("O");
                }
                break;
                case 1: {
                    newButton = findViewById(R.id.button01);
                    findViewById(R.id.button01);
                    newButton.setText("O");
                }
                break;
                case 2: {
                    newButton = findViewById(R.id.button02);
                    findViewById(R.id.button02);
                    newButton.setText("O");
                }
                break;
                case 3: {
                    newButton = findViewById(R.id.button03);
                    findViewById(R.id.button03);
                    newButton.setText("O");
                }
                break;
                case 4: {
                    newButton = findViewById(R.id.button04);
                    findViewById(R.id.button04);
                    newButton.setText("O");
                }
                break;
                case 5: {
                    newButton = findViewById(R.id.button10);
                    findViewById(R.id.button10);
                    newButton.setText("O");
                }
                break;
                case 6: {
                    newButton = findViewById(R.id.button11);
                    findViewById(R.id.button11);
                    newButton.setText("O");
                }
                break;
                case 7: {
                    newButton = findViewById(R.id.button12);
                    findViewById(R.id.button12);
                    newButton.setText("O");
                }
                break;
                case 8: {
                    newButton = findViewById(R.id.button13);
                    findViewById(R.id.button13);
                    newButton.setText("O");
                }
                break;
                case 9: {
                    newButton = findViewById(R.id.button14);
                    findViewById(R.id.button14);
                    newButton.setText("O");
                }
                break;
                case 10: {
                    newButton = findViewById(R.id.button20);
                    findViewById(R.id.button20);
                    newButton.setText("O");
                }
                break;
                case 11: {
                    newButton = findViewById(R.id.button21);
                    findViewById(R.id.button21);
                    newButton.setText("O");
                }
                break;
                case 12: {
                    newButton = findViewById(R.id.button22);
                    findViewById(R.id.button22);
                    newButton.setText("O");
                }
                break;
                case 13: {
                    newButton = findViewById(R.id.button23);
                    findViewById(R.id.button23);
                    newButton.setText("O");
                }
                break;
                case 14: {
                    newButton = findViewById(R.id.button24);
                    findViewById(R.id.button24);
                    newButton.setText("O");
                }
                break;
                case 15: {
                    newButton = findViewById(R.id.button30);
                    findViewById(R.id.button30);
                    newButton.setText("O");
                }
                break;
                case 16: {
                    newButton = findViewById(R.id.button31);
                    findViewById(R.id.button31);
                    newButton.setText("O");
                }
                break;
                case 17: {
                    newButton = findViewById(R.id.button32);
                    findViewById(R.id.button32);
                    newButton.setText("O");
                }
                break;
                case 18: {
                    newButton = findViewById(R.id.button33);
                    findViewById(R.id.button33);
                    newButton.setText("O");
                }
                break;
                case 19: {
                    newButton = findViewById(R.id.button34);
                    findViewById(R.id.button34);
                    newButton.setText("O");
                }
                break;
                case 20: {
                    newButton = findViewById(R.id.button40);
                    findViewById(R.id.button40);
                    newButton.setText("O");
                }
                break;
                case 21: {
                    newButton = findViewById(R.id.button41);
                    findViewById(R.id.button41);
                    newButton.setText("O");
                }
                break;
                case 22: {
                    newButton = findViewById(R.id.button42);
                    findViewById(R.id.button42);
                    newButton.setText("O");
                }
                break;
                case 23: {
                    newButton = findViewById(R.id.button43);
                    findViewById(R.id.button43);
                    newButton.setText("O");
                }
                break;
                case 24: {
                    newButton = findViewById(R.id.button44);
                    findViewById(R.id.button44);
                    newButton.setText("O");
                }
                break;

            }
            //UPDATE BOARD ARRAY FOR X MOVE
            board[row][col] = 2;
            //INCREMENT ROUND COUNT
            roundCount++;
            //SET CURRENT STATE TO THE RETURN VAL OF CHECK WIN METHOD
            currentState = checkForWin();

            //IF THERE IS A WIN/TIE, DISPLAY WIN/TIE MESSAGE
            if (currentState == 2) {
                winMessage.setText("  X");
                winMessage2.setText("Wins!");
                roundCount = 0;
                break;
            } else if (currentState == 3) {
                winMessage.setText("  O");
                winMessage2.setText("Wins!");
                roundCount = 0;
                break;
            } else if (currentState == 1) {
                winMessage.setText("Tie!");
                roundCount = 0;
                break;
            }

        } while (currentState == 0);

    }


	public int checkForWin()
	{

		// CHECK FOR LEFT ROW WIN
		for (int i = 0; i < 4; i++) // LOOP THROUGH FIRST 4 CELLS IN THE ROW WHERE LAST PLAY WAS MADE
		{
			// WHEN SEARCHING THROUGH ROW, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
			if (board[row][i] != board[row][col]) {
				break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
			}

			// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
			if (i == 3) {
				if (board[row][col] == 1)
					return 2; // IF LAST PLAY WAS X THEN CROSS WIN
				else
					return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
			}

		}

		// CHECK FOR RIGHT ROW WIN
		for (int i = 1; i < 5; i++) // LOOP THROUGH LAST 4 CELLS IN THE ROW WHERE LAST PLAY WAS MADE
		{
			// WHEN SEARCHING THROUGH ROW, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
			if (board[row][i] != board[row][col]) {
				break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
			}

			// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
			if (i == 4) {
				if (board[row][col] == 1)
					return 2; // IF LAST PLAY WAS X THEN CROSS WIN
				else
					return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
			}
		}

		// CHECK UPPER COLUMN WIN
		for (int i = 0; i < 4; i++) // LOOP THROUGH TOP 4 CELLS IN THE COLUMN WHERE LAST PLAY WAS MADE
		{
			// WHEN SEARCHING THROUGH COL, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
			if (board[i][col] != board[row][col]) {
				break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
			}

			// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
			if (i == 3) {
				if (board[row][col] == 1)
					return 2; // IF LAST PLAY WAS X THEN CROSS WIN
				else
					return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
			}
		}

		// CHECK LOWER COLUMN WIN
		for (int i = 1; i < 5; i++) // LOOP THROUGH BOTTOM 4 CELLS IN THE COLUMN WHERE LAST PLAY WAS MADE
		{
			// WHEN SEARCHING THROUGH COL, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
			if (board[i][col] != board[row][col]) {
				break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
			}

			// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
			if (i == 4) {
				if (board[row][col] == 1)
					return 2; // IF LAST PLAY WAS X THEN CROSS WIN
				else
					return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
			}
		}

		// CHECK UPPER MIDDLE DIAGONAL WIN IF APPLICABLE (IF ROW = COL)
		if (row == col) {
			for (int i = 0; i < 4; i++) // LOOP THROUGH TOP 4 CELLS IN THE DIAGONAL WHERE LAST PLAY WAS MADE
			{
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][i] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 3) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK LOWER MIDDLE DIAGONAL WIN IF APPLICABLE (IF ROW = COL)
		if (row == col) {
			// LOOP THROUGH BOTTOM 4 CELLS IN THE ANTI-DIAGONAL WHERE LAST PLAY WAS MADE
			for (int i = 1; i < 5; i++) {
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][i] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 4) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK UPPER MIDDLE ANTI-DIAGONAL WIN IF APPLICABLE (IF ROW + COL = 4)
		if (row + col == 4) {
			int n = 4;

			// LOOP THROUGH TOP 4 CELLS IN THE ANTI-DIAGONAL WHERE LAST PLAY WAS MADE
			for (int i = 0; i < n; i++) {
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][(n - i)] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 3) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK LOWER MIDDLE ANTI-DIAGONAL WIN IF APPLICABLE (IF ROW + COL = 4)
		if (row + col == 4) {
			int n = 5;

			// LOOP THROUGH BOTTOM 4 CELLS IN THE MIDDLE ANTI-DIAGONAL WHERE LAST PLAY WAS
			// MADE
			for (int i = 1; i < n; i++) {
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][(n - 1) - i] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 4) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK RIGHT DIAGONAL WIN IF APPLICABLE (IF ROW = COL - 1)
		if (row == col - 1) {
			// LOOP THROUGH THE 4 CELLS IN THE RIGHT DIAGONAL WHERE LAST PLAY WAS MADE
			for (int i = 0; i < 4; i++) {
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][i + 1] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 3) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK LEFT DIAGONAL WIN IF APPLICABLE (IF ROW = COL + 1)
		if (row == col + 1) {
			// LOOP THROUGH THE 4 CELLS IN THE LEFT DIAGONAL WHERE LAST PLAY WAS MADE
			for (int i = 1; i < 5; i++) {
				// WHEN SEARCHING THROUGH DIAG, SEE IF CELLS ARE EQUAL TO THE LAST MOVE
				if (board[i][i - 1] != board[row][col]) {
					break; // IF ANY CELL IS NOT EQUAL TO LAST PLAY, NO WIN
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 4) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK LEFT ANTI-DIAGONAL WIN IF APPLICABLE (IF ROW + COL = 3)
		if (row + col == 3) {
			int n = 4;
			for (int i = 0; i < n; i++) {
				if (board[i][((n - 1) - i)] != board[row][col]) {
					break;
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 3) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK RIGHT ANTI-DIAGONAL WIN IF APPLICABLE (IF ROW + COL = 5)
		if (row + col == 5) {
			int n = 5;
			for (int i = 1; i < n; i++) {

				if (board[i][(n - i)] != board[row][col]) {
					break;
				}

				// IF LOOP ITERATES 4 TIMES WITHOUT BREAKING THEN THERE IS A WIN
				if (i == 4) {
					if (board[row][col] == 1)
						return 2; // IF LAST PLAY WAS X THEN CROSS WIN
					else
						return 3; // IF LAST PLAY WAS 0 THEN NOUGHT WIN
				}
			}
		}

		// CHECK FOR TIE
		if (roundCount == 25)
			return 1; // IF COUNT = 25 AND NO WIN THEN TIE

		return 0; // IF THERE IS NO WIN, KEEP PLAYING
	}

	//RESET BOARD TO CLEAR
    public void onReset(View v) {
        Button buttonReset = findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button clearButton = findViewById(R.id.button00);
                clearButton = findViewById(R.id.button00);
                findViewById(R.id.button00);
                clearButton.setText("");

                clearButton = findViewById(R.id.button01);
                findViewById(R.id.button01);
                clearButton.setText("");

                clearButton = findViewById(R.id.button02);
                findViewById(R.id.button02);
                clearButton.setText("");

                clearButton = findViewById(R.id.button03);
                findViewById(R.id.button03);
                clearButton.setText("");

                clearButton = findViewById(R.id.button04);
                findViewById(R.id.button04);
                clearButton.setText("");

                clearButton = findViewById(R.id.button10);
                findViewById(R.id.button10);
                clearButton.setText("");

                clearButton = findViewById(R.id.button11);
                findViewById(R.id.button11);
                clearButton.setText("");

                clearButton = findViewById(R.id.button12);
                findViewById(R.id.button12);
                clearButton.setText("");

                clearButton = findViewById(R.id.button13);
                findViewById(R.id.button13);
                clearButton.setText("");

                clearButton = findViewById(R.id.button14);
                findViewById(R.id.button14);
                clearButton.setText("");

                clearButton = findViewById(R.id.button20);
                findViewById(R.id.button20);
                clearButton.setText("");

                clearButton = findViewById(R.id.button21);
                findViewById(R.id.button21);
                clearButton.setText("");

                clearButton = findViewById(R.id.button22);
                findViewById(R.id.button22);
                clearButton.setText("");

                clearButton = findViewById(R.id.button23);
                findViewById(R.id.button23);
                clearButton.setText("");

                clearButton = findViewById(R.id.button24);
                findViewById(R.id.button24);
                clearButton.setText("");

                clearButton = findViewById(R.id.button30);
                findViewById(R.id.button30);
                clearButton.setText("");

                clearButton = findViewById(R.id.button31);
                findViewById(R.id.button31);
                clearButton.setText("");

                clearButton = findViewById(R.id.button32);
                findViewById(R.id.button32);
                clearButton.setText("");

                clearButton = findViewById(R.id.button33);
                findViewById(R.id.button33);
                clearButton.setText("");

                clearButton = findViewById(R.id.button34);
                findViewById(R.id.button34);
                clearButton.setText("");

                clearButton = findViewById(R.id.button40);
                findViewById(R.id.button40);
                clearButton.setText("");

                clearButton = findViewById(R.id.button41);
                findViewById(R.id.button41);
                clearButton.setText("");

                clearButton = findViewById(R.id.button42);
                findViewById(R.id.button42);
                clearButton.setText("");

                clearButton = findViewById(R.id.button43);
                findViewById(R.id.button43);
                clearButton.setText("");

                clearButton = findViewById(R.id.button44);
                findViewById(R.id.button44);
                clearButton.setText("");

                //RESET WIN MESSAGE
                winMessage.setText("");
                winMessage2.setText("");

                //RESET BOARD ARRAY
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        board[i][j] = 0;
                    }
                }
            }
        });
    }


}


