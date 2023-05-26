package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		private var fondo_new: fondo = new fondo();
		private var protagonista_new: protagonista = new protagonista();
		private var piso_new: piso = new piso();
		private var antagonista_new: antagonista = new antagonista();
		
		
		public function setup() {
			
			
			// constructor code
			addChild(fondo_new);
			addChild(piso_new);
			addChild(protagonista_new);
			addChild(antagonista_new);
			
			fondo_new.y =200;
			fondo_new.x =275;
			
				piso_new.y =395;
				piso_new.x =275;
				
				protagonista_new.y =200;
				protagonista_new.x =375;
				
					antagonista_new.y =260;
					antagonista_new.x =300;
			
			
			
		}
	}
	
}
