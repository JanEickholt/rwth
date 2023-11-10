    // Einlesen des Strings und Bewegung des RB zum Beginn des Labyrinths
		
		
		move();
		turnLeft();
		String moves_arr = read();
		for(int i = 0; i < 2; i++){
		turnLeft();
		}
		
		String[] moves = moves_arr.split(",");
		for(String i: moves){
		    switch(i){
		        case "M": {
		            move();
		            break;
		        }
		        case "L": {
		            turnLeft();
		            break;
		        }
		        case "R": {
		            turnRight();
		            break;
		        }
		    }    
		}
		
	    move();
	    turnLeft();
	    move();

    }