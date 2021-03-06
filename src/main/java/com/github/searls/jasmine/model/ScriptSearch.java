/*-
 * #%L
 * jasmine-maven-plugin
 * %%
 * Copyright (C) 2010 - 2017 Justin Searls
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.searls.jasmine.model;

import java.io.File;
import java.util.List;

public class ScriptSearch {

  private File directory;
  private List<String> includes;
  private List<String> excludes;

  public ScriptSearch(File directory, List<String> includes, List<String> excludes) {
    this.directory = directory;
    this.includes = includes;
    this.excludes = excludes;
  }

  public File getDirectory() {
    return directory;
  }

  public List<String> getIncludes() {
    return includes;
  }

  public List<String> getExcludes() {
    return excludes;
  }

}
