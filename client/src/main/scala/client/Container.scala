package client

import org.osgi.framework.BundleContext

object Container {
  var bundleContext: BundleContext = _
  def shutdown() {
    bundleContext.getBundle(0).stop()
  }
}
