package org.example.bp.oms.isv;

import io.github.dddplus.plugin.IContainerContext;
import io.github.dddplus.plugin.IPluginListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PluginListener implements IPluginListener {
    @Override
    public void onCommitted(IContainerContext ctx) throws Exception {
        log.info("ISV Jar loaded, ctx:{}", ctx);
    }

    @Override
    public void onPrepared(IContainerContext ctx) throws Exception {
    }
}
