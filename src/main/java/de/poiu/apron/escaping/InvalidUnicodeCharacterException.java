/*
 * Copyright (C) 2018 Marco Herrn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.poiu.apron.escaping;


/**
 * An exception indicating that an invalid unicode escape sequence was given.
 *
 * @author mherrn
 */
class InvalidUnicodeCharacterException extends Exception {

  /**
   * Creates a new instance of <code>InvalidUnicodeCharacterException</code> without detail message.
   */
  public InvalidUnicodeCharacterException() {
  }


  /**
   * Constructs an instance of <code>InvalidUnicodeCharacterException</code> with the specified detail message.
   *
   * @param msg the detail message.
   */
  public InvalidUnicodeCharacterException(String msg) {
    super(msg);
  }


  public InvalidUnicodeCharacterException(String message, Throwable cause) {
    super(message, cause);
  }


  public InvalidUnicodeCharacterException(Throwable cause) {
    super(cause);
  }


  public InvalidUnicodeCharacterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


}
