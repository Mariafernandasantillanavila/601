package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	
	
	public class setup extends MovieClip {
		
		private var fondo_new: fondo = new fondo ();
		private var piso_new: piso = new piso();
		static var PROTAGONISTA_new: PROTAGONISTA = new PROTAGONISTA();
		private var ANTAGONISTA_new: ANTAGONISTA = new ANTAGONISTA();
		
		static var puntos: Number=0;
		static var puntos_box_new: puntos_box = new puntos_box();
		
		public function setup() {
			// constructor code
			
			addChild( fondo_new );
			addChild ( piso_new );
			addChild (PROTAGONISTA_new);
			addChild (ANTAGONISTA_new);
			addChild (puntos_box_new);
			
			puntos_box_new.x=550;
			puntos_box_new.y=100;
			puntos_box_new.puntostxt.text=String(puntos);
			
			fondo_new.y = 0;
			fondo_new.x = 0;
			
			piso_new.y = 350;
			piso_new.x = 0;
			
			PROTAGONISTA_new.y = 350;
			PROTAGONISTA_new.x = 280;
			
			ANTAGONISTA_new.y = 50;
			ANTAGONISTA_new.x = 320;
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
				
		}
				public function actualiza_puntos(e:Event){
				puntos_box_new.puntostxt.text=String(puntos);
								  
		}
	}
	
}
