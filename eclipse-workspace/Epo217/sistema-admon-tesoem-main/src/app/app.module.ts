import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {RegistroComponent} from './registro/registro.component';
import {RouterModule,Routes} from '@angular/router';
import { DireccionComponent } from './direccion/direccion.component';

      const routes:Routes=[
        {path:'home', component:AppComponent},
        {path:'registrarse', component:RegistroComponent},
        {path:'direccion', component:DireccionComponent}
      ];

@NgModule({
  declarations: [
    AppComponent,
    RegistroComponent,
    DireccionComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
