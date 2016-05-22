package com.Dimmer2222.DAPI.interfaces;

import com.Dimmer2222.DAPI.exceptions.ValueExistException;
import com.Dimmer2222.DAPI.exceptions.ValueNotExistException;
import org.bukkit.Location;
import org.bukkit.Material;

import java.util.Set;

/*
The MIT License (MIT)

Copyright (c) 2016 Dimmer2222

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

public interface Special<T> {

    /**
     * Creates a Object from a Special Type like Items or Blocks or it save the location of the Object
     * @param object Object(Items or Blocks)
     * @param name Name of the Object
     * @throws ValueExistException Will be thrown if the Object Name is already taken.
     */
    void createSpecialObject(T object, String name) throws ValueExistException;

    /**
     * Saves the Object like the first createSpeicalObject method but you can give it a Location
     * @param loc Location
     * @param name Name of the Object
     * @throws ValueExistException Will be thrown if the Object Name is already taken.
     */
    void createSpecialObject(Location loc, String name) throws ValueExistException;

    /**
     *
     * @param Name
     * @return
     * @throws ValueNotExistException
     */

    T getSpecialObject(String Name) throws ValueNotExistException;

    Set<T> getSpecialObjects();

    void deleteSpecialObject(String name) throws ValueNotExistException;

    Location getSpecialObjectLocation(String name) throws ValueNotExistException;


}
