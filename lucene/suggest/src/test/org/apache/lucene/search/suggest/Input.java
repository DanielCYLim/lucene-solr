package org.apache.lucene.search.suggest;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.lucene.util.BytesRef;

/** corresponds to {@link InputIterator}'s entries */
public final class Input {
  public final BytesRef term;
  public final long v;
  public final BytesRef payload;
  public final boolean hasPayloads;

  public Input(BytesRef term, long v, BytesRef payload) {
    this(term, v, payload, true);
  }
  
  public Input(String term, long v, BytesRef payload) {
    this(new BytesRef(term), v, payload, true);
  }
  
  public Input(BytesRef term, long v) {
    this(term, v, null, false);
  }
  
  public Input(String term, long v) {
    this(new BytesRef(term), v, null, false);
  }
  
  public Input(BytesRef term, long v, BytesRef payload, boolean hasPayloads) {
    this.term = term;
    this.v = v;
    this.payload = payload;
    this.hasPayloads = hasPayloads;
  }
  
  public boolean hasPayloads() {
    return hasPayloads;
  }
}