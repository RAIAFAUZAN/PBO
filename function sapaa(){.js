// function sapa(nama) {
// console.log("halo," + nama + "!");
// }

// sapa("nico");
// sapa("loki");

// let car = {
// name: "fiat",
// model: 500,
// weight: "850kg",

// start: function () {
// console.log("mobil dinyalakan.");
// },
// drive: function () {
// console.log("mobil berjalan");
// },
// brake: function () {
// console.log("mobil mengerem.");
// },
// stop: function () {
// console.log("mobil berhenti.");
// },
// };

// console.log(car.name);
// console.log(car.color);

// car.start();
// car.drive();

// let bicycle = {
// name: "united",
// gear: 7,
// warna: "merah",
// start: function () {
// console.log("sepeda mulai dikayuh");
// },
// brake: function () {
// console.log("sepeda mengerem");
// },
// };

// console.log(bicycle.name);
// console.log(bicycle.color);

// bicycle.start();
// bicycle.brake();

// function car(name, model, color, weight) {
//   this.name = name;
//   this.model = model;
//   this.color = color;
//   this.weight = weight;

//   this.start = function () {
//     console.log(`${this.name}dinyalakan`);
//   };
//   this.drive = function () {
//     console.log(`${this.name}sedang berjalan`);
//   };
// }

// let car1 = new car("Toyota", 2020, "blue", "1000kg");
// let car2 = new car("honda", 2021, "red", "950kg");

// car1.start();
// car2.start();

// class Bike {
//   constructor(name, gear, color) {
//     this.name = name;
//     this.gear = gear;
//     this.color = color;
//     this.speed = 0; // kecepatan awal
//   }

//   start() {
//     console.log(`${this.name} mulai digoes`);
//     this.speed = 5;
//   }

//   drive() {
//     this.speed += 5;
//     console.log(`${this.name} berjalan dengan kecepatan ${this.speed} km/jam`);
//   }

//   brake() {
//     if (this.speed > 0) {
//       this.speed -= 3;
//       console.log(
//         `${this.name} mengerem, kecepatan turun jadi ${this.speed} km/jam`
//       );
//     } else {
//       console.log(`${this.name} sudah berhenti`);
//     }
//   }

//   stop() {
//     this.speed = 0;
//     console.log(`${this.name} berhenti sepenuhnya`);
//   }

//   changeGear(newGear) {
//     this.gear = newGear;
//     console.log(`${this.name} ganti gear ke ${this.gear}`);
//   }

//   getInfo() {
//     console.log(
//       `Sepeda: ${this.name}, Gear: ${this.gear}, Warna: ${this.color}, Kecepatan: ${this.speed} km/jam`
//     );
//   }
// }

// // Contoh penggunaan:
// let myBike = new Bike("United", 22, "Blue");
// myBike.start();
// myBike.drive();
// myBike.brake();
// myBike.brake();
// myBike.stop();
// myBike.changeGear(10);
// myBike.getInfo();

class Student {
  constructor(nama, nim, jurusan, angkatan) {
    this.nama = nama;
    this.nim = nim;
    this.jurusan = jurusan;
    this.angkatan = angkatan;
  }

  introduce() {
    console.log(
      `Halo saya ${this.nama}, mahasiswa ${this.jurusan} angkatan ${this.angkatan}`
    );
  }

  isSenior() {
    return this.angkatan < 2025;
  }

  displayInfo() {
    console.log(
      `Nama: ${this.nama}, NIM: ${this.nim}, Jurusan: ${this.jurusan}, Angkatan: ${this.angkatan}`
    );
  }
}

// Contoh penggunaan:
let mhs1 = new Student("Budi", "123456789", "Rekayasa Perangkat Lunak", 2022);
let mhs2 = new Student("Siti", "987654321", "Animasi", 2025);

mhs1.introduce();
console.log("Apakah senior? ", mhs1.isSenior());
mhs1.displayInfo();

mhs2.introduce();
console.log("Apakah senior? ", mhs2.isSenior());
mhs2.displayInfo();
