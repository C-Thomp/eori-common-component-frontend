/*
 * Copyright 2020 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.eoricommoncomponent.frontend.controllers

import javax.inject.Inject
import play.api.Configuration

class FeatureFlags @Inject() (config: Configuration) {

  def loadConfig(path: String): Boolean = config.get[Boolean](path)

  val matchingEnabled: Boolean = loadConfig(path = "features.matchingEnabled")

  val rowHaveUtrEnabled: Boolean = loadConfig("features.rowHaveUtrEnabled")
}