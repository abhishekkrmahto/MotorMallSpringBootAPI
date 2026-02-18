package com.motormall.motormallserver.controller;

import com.motormall.motormallserver.model.CarModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CarModelController {

    @GetMapping("/")
    public List<CarModel> getAllCars(){
        List<CarModel>cars = new ArrayList<>();

        CarModel c1 = new CarModel();
        c1.setImgLink("bmwm8.jpg");
        c1.setCarName("BMW M8 CS");
        c1.setCarBrand("BMW");
        c1.setCarPower("617 bhp");
        c1.setSpeed0to100("2.5s");
        c1.setTopSpeed("270km/hr");
        c1.setPrice("₹3.20 cr");
        c1.setCardetails("The BMW M8 Competition features a 4.4-liter twin-turbocharged V8 engine producing 625 horsepower (617 hp in some markets) at 6,000 rpm and (750 text{ Nm}) of torque, making it one of BMW's most powerful production cars");
        c1.setVideoLink("bmwm8video.mp4");
        cars.add(c1);

        CarModel c2 = new CarModel();
        c2.setImgLink("mercedesamg.jpg");
        c2.setVideoLink("amggtvideo.mp4");
        c2.setCarName("AMG GT 63");
        c2.setCarBrand("MERCEDES");
        c2.setCarPower("469 bhp");
        c2.setSpeed0to100("3.5s");
        c2.setTopSpeed("210km/hr");
        c2.setPrice("₹2.00 cr");
        c2.setCardetails("The Mercedes-AMG GT offers varied specs, typically featuring a 4.0L Twin-Turbo V8 engine, with power ranging from around 476 hp (GT Coupe) to over 800 hp in hybrid versions like the GT 63 S E PERFORMANCE");
        cars.add(c2);


        CarModel c3 = new CarModel();
        c3.setImgLink("audirs.jpg");
        c3.setVideoLink("audirsvideo.mp4");
        c3.setCarName("RS Etron GT");
        c3.setCarBrand("AUDI");
        c3.setCarPower("912 bhp");
        c3.setSpeed0to100("1.5s");
        c3.setTopSpeed("310km/hr");
        c3.setPrice("₹2.16 cr");
        c3.setCardetails("Audi RS models (RennSport) are the high-performance pinnacle of Audi's lineup, featuring turbocharged engines (V6 or V8), Quattro AWD, and aggressive styling");
        cars.add(c3);



        CarModel c4 = new CarModel();
        c4.setImgLink("rrsport.jpg");
        c4.setVideoLink("rrsportvideo.mp4");
        c4.setCarName("RR SPORT");
        c4.setCarBrand("LAND ROVER");
        c4.setCarPower("612 bhp");
        c4.setSpeed0to100("3.5s");
        c4.setTopSpeed("220km/hr");
        c4.setPrice("₹1.92 cr");
        c4.setCardetails("The Range Rover Sport is a luxury performance SUV, with 2025/2026 models offering 3.0L mild-hybrid diesel/petrol and a powerful 4.4L V8 (up to 635 HP) engine options, featuring 8-speed automatic transmission and AWD");
        cars.add(c4);


        CarModel c5 = new CarModel();
        c5.setImgLink("sclass.jpg");
        c5.setVideoLink("sclassvideo.mp4");
        c5.setCarName("S class");
        c5.setCarBrand("MERCEDES");
        c5.setCarPower("412 bhp");
        c5.setSpeed0to100("3.5s");
        c5.setTopSpeed("220km/hr");
        c5.setPrice("₹2.77 cr");
        c5.setCardetails("The S-Class is a 5 seater 6 cylinder car and has length of 5289 mm, width of 2109 mm and a wheelbase of 2850 mm. Read More. Mercedes-Benz S-Class");
        cars.add(c5);


        CarModel c6 = new CarModel();
        c6.setImgLink("porche911.jpg");
        c6.setVideoLink("prche911video.mp4");
        c6.setCarName("911 S");
        c6.setCarBrand("PORCHE");
        c6.setCarPower("911 bhp");
        c6.setSpeed0to100("1.1s");
        c6.setTopSpeed("356km/hr");
        c6.setPrice("₹2.12 cr");
        c6.setCardetails("The Porsche 911 is a luxury sports car, available as a 2+2 seater in Coupé, Cabriolet, or Targa body styles, featuring rear or all-wheel drive and a rear-mounted flat-six engine. It is renowned for its high-performance");
        cars.add(c6);


        CarModel c7 = new CarModel();
        c7.setImgLink("bmwm4.jpg");
        c7.setVideoLink("bmwm4video.mp4");
        c7.setCarName("M4 CS");
        c7.setCarBrand("BMW");
        c7.setCarPower("781 bhp");
        c7.setSpeed0to100("1.4s");
        c7.setTopSpeed("346km/hr");
        c7.setPrice("₹3.34 cr");
        c7.setCardetails("The BMW M4 is a high-performance, 4-seater coupe powered by a 3.0-liter straight-six twin-turbo engine (S58), delivering up to 550 hp (CS variant) or 523 bhp (Competition). It features an 8-speed automatic (or 6-speed manual), RWD or xDrive AWD, ");
        cars.add(c7);


        CarModel c8 = new CarModel();
        c8.setImgLink("rrvelar.jpg");
        c8.setVideoLink("rrvelarvideo.mp4");
        c8.setCarName("RR VELAR");
        c8.setCarBrand("LAND ROVER");
        c8.setCarPower("621 bhp");
        c8.setSpeed0to100("1.9s");
        c8.setTopSpeed("214km/hr");
        c8.setPrice("₹1.26 cr");
        c8.setCardetails("The Range Rover Velar is a luxury mid-size SUV, positioned between the Evoque and Sport, featuring a sleek, minimalist design with flush door handles and premium, tech-forward interiors.");
        cars.add(c8);


         CarModel c9 = new CarModel();
        c9.setImgLink("rrGhost.jpg");
        c9.setVideoLink("rrGhost.mp4");
        c9.setCarName("RR GHOST");
        c9.setCarBrand("ROLLS ROYCE");
        c9.setCarPower("675 bhp");
        c9.setSpeed0to100("1.8s");
        c9.setTopSpeed("256km/hr");
        c9.setPrice("₹9.26 cr");
        c9.setCardetails(
                "It features a 6.75-litre twin-turbo V12 engine producing 563hp (600hp for Black Badge) and 820Nm–900Nm of torque, utilizing all-wheel drive, a 48-volt suspension system, and an Aluminum Architecture of Luxury frame. ");
        cars.add(c9);

        CarModel c10 = new CarModel();
        c10.setImgLink("rollsRoyceSuv.jpg");
        c10.setVideoLink("rrCullinan.mp4");
        c10.setCarName("RR CULLINAN");
        c10.setCarBrand("ROLLS ROYCE");
        c10.setCarPower("571 bhp");
        c10.setSpeed0to100("2.1s");
        c10.setTopSpeed("220km/hr");
        c10.setPrice("₹7.56 cr");
        c10.setCardetails(
                "The Rolls-Royce Cullinan is a ultra-luxury SUV powered by a 6.75-litre twin-turbo V12 engine producing and of torque.");
        cars.add(c10);

        CarModel c11 = new CarModel();
        c11.setImgLink("boatTail.jpg");
        c11.setVideoLink("boatTail.mp4");
        c11.setCarName("RR BOAT-TAIL");
        c11.setCarBrand("ROLLS ROYCE");
        c11.setCarPower("715 bhp");
        c11.setSpeed0to100("2.2s");
        c11.setTopSpeed("270km/hr");
        c11.setPrice("₹212.56 cr");
        c11.setCardetails(
                " Inspired by 1930s yachts and luxury marine design, it features a unique rear \"butterfly-opening\" deck, a 6.75-liter twin-turbo V12 engine, and fully bespoke");
        cars.add(c11);


        CarModel c12 = new CarModel();
        c12.setImgLink("bentContGT.jpg");
        c12.setVideoLink("bentGTvideo.mp4");
        c12.setCarName("BENT-CONT-GT");
        c12.setCarBrand("BENTLEY");
        c12.setCarPower("812 bhp");
        c12.setSpeed0to100("1.3s");
        c12.setTopSpeed("290km/hr");
        c12.setPrice("₹4.56 cr");
        c12.setCardetails(
                "The 4th generation Bentley Continental GT, particularly the Speed and Mulliner models, features a new Ultra Performance Hybrid V8 powertrain producing 782 PS (771 bhp) and of torque");
        cars.add(c12);

        CarModel c13 = new CarModel();
        c13.setImgLink("mers-glc.jpg");
        c13.setVideoLink("mers-glc.mp4");
        c13.setCarName("GLC");
        c13.setCarBrand("MERCEDES");
        c13.setCarPower("714 bhp");
        c13.setSpeed0to100("2.3s");
        c13.setTopSpeed("198km/hr");
        c13.setPrice("₹2.61 cr");
        c13.setCardetails(
                "luxury compact SUV available in India with 2.0-litre petrol (258hp/400Nm) or diesel (197hp/440Nm) engines, featuring standard 4Matic all-wheel drive, a 9-speed automatic gearbox, and mild-hybrid technology for added efficiency");
        cars.add(c13);


        CarModel c14 = new CarModel();
        c14.setImgLink("bugatti-centodieci.jpg");
        c14.setVideoLink("bugati-Centodieci-video.mp4");
        c14.setCarName("CENTODIECI");
        c14.setCarBrand("BUGATTI");
        c14.setCarPower("914 bhp");
        c14.setSpeed0to100("0.92s");
        c14.setTopSpeed("318km/hr");
        c14.setPrice("₹71.12 cr");
        c14.setCardetails(
                "The Bugatti Centodieci is an ultra-rare, $9 million (approx. Rs 78 crore) hypercar based on the Chiron, built to honor the 1990s EB110 with only 10 units produced. It features a 1,600 hp 8.0-liter W16 engine, accelerating from 0-100 km/h in 0.9 seconds");
        cars.add(c14);


        CarModel c15 = new CarModel();
        c15.setImgLink("rimacNavera.jpg");
        c15.setVideoLink("rimacNaveraVideo.mp4");
        c15.setCarName("RIMAC R");
        c15.setCarBrand("NAVERA");
        c15.setCarPower("814 bhp");
        c15.setSpeed0to100("1.5s");
        c15.setTopSpeed("288km/hr");
        c15.setPrice("₹16.12 cr");
        c15.setCardetails(
                "The Rimac Nevera R is a faster, more agile, and track-focused version of the standard Nevera, producing 2,107 hp from four motors, reaching 0–60 mph in 1.66 seconds");
        cars.add(c15);


        CarModel c16 = new CarModel();
        c16.setImgLink("ferrari-sf-90.jpg");
        c16.setVideoLink("ferrari-sf-90-video.mp4");
        c16.setCarName("SF 90");
        c16.setCarBrand("FERRARI");
        c16.setCarPower("915 bhp");
        c16.setSpeed0to100("1.1s");
        c16.setTopSpeed("309km/hr");
        c16.setPrice("₹55.12 cr");
        c16.setCardetails(
                "The Ferrari SF90 Stradale (Type F173) is a mid-engine PHEV (plug-in hybrid electric vehicle) sports car produced by the Italian automobile manufacturer Ferrari. The car shares its name with the SF90 Formula One car ");
        cars.add(c16);














        return cars;
    }
}
