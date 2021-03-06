/*
 * Copyright 2012 Benjamin Glatzel <benjamin.glatzel@me.com>
 *
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
 */

package org.terasology.data.blocks.definitions.liquid

/**
 * Don't fall in the lava! Well, at least not after it starts hurting
 * As a liquid this block likely gets some added stats here, like viscosity
 * Lava blocks may also differ in height? If they're stored in a flowing state
 * That might be an example of a meta-block - need more info than the byte ID
 */
block {
    version = 1
    shape = "TrimmedLoweredCube"
    loweredShape = "LoweredCube"
    // Let the lava shine!
    luminance = 15
    hardness = 0
}