/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R
import java.util.UUID

object PuppyProvider {
    val PUPPIES: List<Puppy> = listOf(
        Puppy(
            UUID.randomUUID().toString(),
            "Gizmo",
            "Shankle sausage alcatra pork belly strip steak pork chop t-bone boudin doner drumstick ball tip tenderloin tri-tip sirloin. Meatloaf capicola boudin ham jowl bresaola prosciutto ribeye. Fatback filet mignon capicola, ball tip bresaola strip steak prosciutto porchetta sirloin pig cow turducken chislic. Hamburger pork frankfurter, rump chicken burgdoggen andouille. Kevin bacon chicken, salami hamburger ground round ham short loin bresaola pork loin ribeye. Shankle drumstick pastrami picanha cupim capicola.",
            "Tokyo",
            1,
            R.drawable._1
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Jack",
            "Meatball cupim hamburger short loin shank swine meatloaf ground round. Leberkas swine kevin capicola chuck beef ribs picanha bacon flank short ribs tail pork belly alcatra prosciutto strip steak. Pork belly venison bacon, fatback pork chop pork loin strip steak chislic pork cow shankle short ribs biltong drumstick kevin. Flank tongue turducken pork drumstick shoulder burgdoggen salami picanha leberkas spare ribs biltong. Boudin pig ground round jowl short ribs alcatra. Cupim burgdoggen t-bone ham strip steak prosciutto sirloin porchetta, short loin biltong meatball ham hock.",
            "Moscow",
            2,
            R.drawable._2
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Teddy",
            "Picanha chislic pancetta biltong buffalo sausage. Chicken corned beef beef ribs, picanha boudin shank fatback buffalo turducken kielbasa alcatra. Tail pork tongue short ribs, corned beef strip steak flank tri-tip jerky pork belly brisket doner. Alcatra cow fatback, corned beef jerky swine cupim chicken rump.",
            "Jakarta",
            5,
            R.drawable._3
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Jax",
            "Bacon ipsum dolor amet leberkas capicola ham strip steak corned beef. Fatback ball tip ham, shankle jowl capicola salami t-bone rump turkey porchetta pork loin chicken venison chuck. Ham hock short loin short ribs picanha chuck. Kevin pork loin chuck pig tenderloin turkey bacon buffalo porchetta. Meatloaf burgdoggen pig buffalo short ribs filet mignon cow tongue t-bone ball tip doner turkey. Pastrami pork belly biltong beef, doner bresaola pork short ribs turkey tongue venison salami. Bacon turducken prosciutto swine, cow biltong chicken short ribs spare ribs burgdoggen ball tip drumstick ham boudin",
            "Toronto",
            3,
            R.drawable._4
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Tucker",
            "Shank venison corned beef frankfurter filet mignon bacon. Pastrami bresaola capicola biltong beef ribs meatball chislic brisket ball tip tongue tail. Jerky ham hamburger biltong. Beef ribs tenderloin drumstick ball tip corned beef landjaeger jerky short ribs pork loin, turkey pork belly andouille salami. Tri-tip tongue beef venison landjaeger cupim. Ground round chislic boudin tongue alcatra short loin leberkas",
            "Atlanta",
            9,
            R.drawable._5
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Copper",
            "Tail cow chicken, pork belly t-bone fatback chuck turducken. Turducken meatloaf alcatra kielbasa sausage hamburger corned beef picanha ham hock beef ribs spare ribs ground round. Shank picanha ham hock beef ribs. Brisket alcatra cupim, hamburger tail short loin pork bresaola filet mignon ham spare ribs.",
            "Fukuoka ",
            7,
            R.drawable._6
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Diesel",
            "Ham sausage doner, tail pastrami jowl filet mignon cupim porchetta shank. Prosciutto landjaeger capicola chicken spare ribs, pork shankle tri-tip fatback. Pork chop short ribs salami, ham hock turducken buffalo tail cupim bresaola. Frankfurter prosciutto flank brisket turkey, bacon jerky beef meatloaf. Salami filet mignon meatloaf, frankfurter chislic ground round kielbasa sirloin alcatra ribeye chicken cow tongue. Prosciutto bacon sirloin, corned beef boudin tongue turkey landjaeger kevin swine.",
            "Madrid",
            2,
            R.drawable._7
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Zeus",
            "Shank shankle tongue chicken frankfurter jerky, pork loin flank short loin fatback cupim. T-bone picanha pig sirloin chislic. Chislic bresaola shoulder pastrami ground round kevin tail corned beef ham. Prosciutto bresaola short loin chuck. Pig boudin swine, bacon pork loin ground round fatback hamburger turducken doner tenderloin bresaola.",
            "Belo Horizonte",
            1,
            R.drawable._8
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Avery",
            "Burgdoggen shankle cow, pork chop strip steak doner pork. Ham hock rump t-bone turducken pork pork loin biltong. Rump ham hock beef ribs salami, spare ribs filet mignon prosciutto tri-tip kevin pig t-bone short ribs. Tri-tip boudin kevin, chislic sirloin shoulder jerky drumstick t-bone. Pork belly salami andouille, venison picanha chislic shank turkey pancetta spare ribs. Hamburger ground round meatloaf, cupim beef ribs pork turducken alcatra fatback strip steak pork loin landjaeger ham pancetta.",
            "Paris",
            2,
            R.drawable._9
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Biscuit",
            "Bacon ribeye salami flank brisket. Sirloin porchetta boudin, tenderloin jowl swine shoulder frankfurter t-bone. Buffalo boudin jowl ribeye meatball pork loin, pig short loin chuck shank sausage tenderloin frankfurter bacon prosciutto. Jowl turducken pig short loin alcatra. Ground round pork belly boudin ribeye t-bone landjaeger meatloaf tail jerky prosciutto.",
            "Frankfurt",
            4,
            R.drawable._10
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Brandy",
            "Tri-tip bacon pig bresaola prosciutto, beef doner landjaeger filet mignon strip steak flank. Drumstick picanha ground round tail jowl rump brisket tongue tenderloin leberkas kevin, pig sirloin pork loin. Swine pastrami ham hock corned beef, sirloin bresaola porchetta leberkas burgdoggen frankfurter. Pork loin shankle pork chop cupim shank hamburger filet mignon leberkas ground round ribeye pancetta. Meatball chislic cow tri-tip, brisket kevin rump leberkas ground round. Kevin venison buffalo burgdoggen turducken fatback landjaeger alcatra. Sausage tri-tip jerky, pig beef frankfurter kielbasa burgdoggen fatback hamburger venison tenderloin.",
            "Los Angeles",
            1,
            R.drawable._11
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Carla",
            "Beef ribs ham pastrami strip steak, shankle pork belly biltong tail pancetta. Venison frankfurter bresaola biltong. Beef ribs ribeye chicken, salami picanha prosciutto tail drumstick ham hock capicola boudin pork chop jowl brisket hamburger. Shankle buffalo turkey, sausage short ribs doner picanha chuck swine pancetta. Tri-tip buffalo chuck, spare ribs swine alcatra filet mignon doner salami shank chicken. Shank strip steak pork belly pork loin, tenderloin sirloin t-bone capicola swine tri-tip ham hock jerky landjaeger drumstick.",
            "Berlin",
            2,
            R.drawable._12
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Duchess",
            "Frankfurter flank prosciutto tri-tip, pork chop swine shank ham ball tip brisket turducken burgdoggen. Ham hock beef ribs jerky ribeye sausage salami flank tail. Beef ribs cupim flank pork ham hock venison kevin kielbasa boudin meatloaf ribeye tenderloin filet mignon pork loin. Porchetta chicken picanha andouille beef ribs alcatra buffalo boudin. Porchetta drumstick tri-tip tail. Chislic tail beef ribs meatball. Salami sirloin venison, chicken sausage chuck filet mignon bacon prosciutto kevin shankle bresaola strip steak porchetta.",
            "Buenos Aires",
            7,
            R.drawable._13
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Kiki",
            "Buffalo prosciutto t-bone picanha pork loin tail, turkey bacon. Short ribs shankle beef ribs frankfurter capicola sirloin doner, swine tongue kielbasa strip steak brisket. Doner picanha biltong ham, ribeye t-bone tenderloin prosciutto kielbasa meatloaf. Sausage kielbasa biltong turkey salami pork loin shankle pork belly capicola.",
            "Mumbai",
            6,
            R.drawable._14
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Muffin",
            "Corned beef strip steak pork belly, pork buffalo short loin ribeye cow kevin chislic frankfurter. Tenderloin short loin shoulder, t-bone ham hock rump ham pastrami chuck sausage buffalo jerky cupim cow. Bacon beef turducken short loin ham hock, rump ground round. Corned beef bacon pork loin frankfurter pork belly andouille cupim brisket strip steak ball tip shankle pork shank tail meatball. Shoulder turkey burgdoggen jerky, ham hock salami chislic flank bacon kevin doner.",
            "Cairo",
            4,
            R.drawable._15
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Pebbles",
            "Kielbasa sirloin drumstick porchetta biltong swine flank doner leberkas beef bacon. Spare ribs pastrami filet mignon short ribs frankfurter shank, kevin pork biltong. T-bone andouille sirloin ham turducken shoulder. Tongue burgdoggen pork tenderloin porchetta, doner alcatra short ribs. Kielbasa t-bone ham hock landjaeger bresaola. Picanha t-bone pig shoulder pancetta.",
            "Mexico City",
            2,
            R.drawable._16
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Ace",
            "Tongue hamburger spare ribs ball tip. Capicola ball tip picanha hamburger corned beef, ham short loin jowl. Ribeye ham hock andouille bresaola doner, fatback burgdoggen. Shank meatloaf pancetta short ribs ham rump. Tenderloin fatback ham picanha frankfurter turkey.",
            "São Paulo",
            3,
            R.drawable._17
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Vinnie",
            "Andouille drumstick sausage beef, pastrami landjaeger chislic. Chicken spare ribs ground round burgdoggen. Turducken beef salami picanha doner, sausage biltong shank bacon ham hock andouille. Cow jowl pastrami ribeye andouille. Pork belly buffalo brisket cupim leberkas drumstick. Corned beef jowl tongue buffalo ball tip cupim ground round beef ribs.",
            "Shanghai",
            6,
            R.drawable._19
        ),
        Puppy(
            UUID.randomUUID().toString(),
            "Tyson",
            "Meatloaf bacon ham pancetta tri-tip, pork belly bresaola. Pork ham hock chislic beef ribs turkey tail meatloaf. Pork chop burgdoggen t-bone boudin ham hock. Turkey tenderloin brisket shoulder, corned beef venison leberkas. Capicola pig beef burgdoggen shoulder. Chislic shankle salami rump bresaola, ribeye porchetta shank tri-tip jerky spare ribs short loin. Flank shoulder ham boudin jowl.",
            "Delhi",
            5,
            R.drawable._20
        )
    )

    fun getById(id: String?): Puppy {
        return PUPPIES.first { it.id == id }
    }
}
