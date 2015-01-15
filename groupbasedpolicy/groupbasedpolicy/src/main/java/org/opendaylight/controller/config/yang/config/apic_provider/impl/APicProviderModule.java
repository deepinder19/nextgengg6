package org.opendaylight.controller.config.yang.config.apic_provider.impl;

import org.opendaylight.groupbasedpolicy.renderer.apic.APicRenderer;

public class APicProviderModule extends org.opendaylight.controller.config.yang.config.apic_provider.impl.AbstractAPicProviderModule {
    public APicProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public APicProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.config.apic_provider.impl.APicProviderModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return new APicRenderer(getDataBrokerDependency(),
                                     getRpcRegistryDependency());
    }

}
