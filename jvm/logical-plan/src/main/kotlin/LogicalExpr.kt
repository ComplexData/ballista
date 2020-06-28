// Copyright 2020 Andy Grove
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.ballistacompute.logical

import org.ballistacompute.datatypes.Field

/**
 * Logical Expression for use in logical query plans. The logical expression provides information
 * needed during the planning phase such as the name and data type of the expression.
 */
interface LogicalExpr {

  /**
   * Return meta-data about the value that will be produced by this expression when evaluated
   * against a particular input.
   */
  fun toField(input: LogicalPlan): Field
}
