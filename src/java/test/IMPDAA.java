/* Copyright (c) 2021, Idriss Riouak <idriss.riouak@cs.lth.se>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package test;

import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import org.extendj.IntraJ;
import org.extendj.analysis.Analysis;
import org.extendj.analysis.Warning;
import org.extendj.ast.CFGNode;
import org.extendj.ast.CFGRoot;
import org.extendj.ast.CompilationUnit;
import org.extendj.ast.ConstructorDecl;
import org.extendj.ast.MethodDecl;
import org.extendj.ast.Program;
import org.extendj.flow.utils.IJGraph;
import org.extendj.flow.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class IMPDAA {
  /** Directory where the test input files are stored. */
  private static final File TEST_DIRECTORY =
      new File("testfiles/DataFlow/IMPDAA");

  @Test
  public void IMPDAA01() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA01.java",
                           Analysis.AvailableAnalysis.IMPDAA, 2);
  }

  @Test
  public void IMPDAA02() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA02.java",
                           Analysis.AvailableAnalysis.DAA, 1);
  }

  @Test
  public void IMPDAA03() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA03.java",
                           Analysis.AvailableAnalysis.IMPDAA, 3);
  }

  @Test
  public void IMPDAA04() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA04.java",
                           Analysis.AvailableAnalysis.IMPDAA, 8);
  }

  @Test
  public void IMPDAA05() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA05.java",
                           Analysis.AvailableAnalysis.IMPDAA, 17);
  }

  @Test
  public void IMPDAA06() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA06.java",
                           Analysis.AvailableAnalysis.IMPDAA, 8);
  }

  @Test
  public void IMPDAA07() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA07.java",
                           Analysis.AvailableAnalysis.IMPDAA, 19);
  }

  @Test
  public void IMPDAA08() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA08.java",
                           Analysis.AvailableAnalysis.IMPDAA, 16);
  }

  @Test
  public void IMPDAA09() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA09.java",
                           Analysis.AvailableAnalysis.IMPDAA, 2);
  }

  @Test
  public void IMPDAA10() {
    UtilTest.checkWarnings(TEST_DIRECTORY, "IMPDAA10.java",
                           Analysis.AvailableAnalysis.IMPDAA, 16);
  }
}
