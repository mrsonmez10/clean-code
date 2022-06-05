package com.tutorial.clean.code.chapter17.c02;

public class TestDrive {

    public static void main(String[] args) {

        /*
            Environment
            E1: Build Requires more than one step
             - Projeyi çalıştırmak basit stepler içermeli
            E2: Test Require More than one step
             - testleri çalıştırmak için de aynı şekilde az step içermeli

            -------------------------------------------

            Functions:
            F1: Too many arguments:
             - Konuştuk..
            F2: Output Arguments
             - null olmamalı
            F3: Flag Arguments
             - 1 den fazla iş yapacağını gösterir konustuk.
            F4: Dead Function
             - hiç kullanılmayan functionları silin

             -------------------------------------------

            General:
            G3: Incorrect Behavior at the Boundaries
             - Koduna güvenme edge caseleri bulmaya çalış
            G5: Duplication
             - Code duplication önüne geç. (sonar vs gibi toollar)
            G6: Code at Wrong Level Of Abstraction
             - kitap örneğinde göster
            G7: Base Classes Depending on their Derivatives
             - Car Abstract class (create(String)), bmw alt class,
             car bmw'ye bağlı olmamalı
            G10: Vertical Seperation
             - birbirini çağıran metotlar birbirine yakın olması
             -a - b
            G11: Inconsistency
             - Aynı isimlendirme patterninde olmalı, birinde create birinde save
             kullanma
            G14: Feature Envy
             - Kitap üstünden anlat
            G22: Understand the algorithm
             - Algoritmayı anlamadan işe girişmeyin. (Hackerrank)
            G23: Prefer poly. to if/else Switch/case
             - car bmw
            G25: Replace Magic Numbers with Named Constant:
             - Kitap
            G26: Be precise
             - set niye kullandın, concurrent hashmap vs..
            G29: Avoid negative conditionals
             - Kitap
            G30: Functions should do one thing
             - Code metrics ile bağlayalım - Kitap
            G31: Hidden Temporal Couplings
             - kitap
            G33: Encapsulate Boundary Conditions
             - Kitap
         */
    }
}
