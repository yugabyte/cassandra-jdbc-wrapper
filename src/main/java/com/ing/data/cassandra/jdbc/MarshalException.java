/*
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.ing.data.cassandra.jdbc;

/**
 * An exception thrown during a marshalling process.
 */
public class MarshalException extends RuntimeException {
    /**
     * Constructs a {@code MarshalException} with a given message.
     *
     * @param message A message describing the exception.
     */
    public MarshalException(final String message) {
        super(message);
    }

    /**
     * Constructs a {@code MarshalException} with a given message and cause.
     *
     * @param message A message describing the exception.
     * @param cause   The underlying cause of the exception.
     */
    public MarshalException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
