package org.apache.http.client.methods;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC59759znB;
import o.InterfaceC59546zjA;
import o.InterfaceC59556zjK;
import o.InterfaceC59558zjM;
import o.InterfaceC59577zjf;
import o.InterfaceC59779znV;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.message.HeaderGroup;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractExecutionAwareRequest extends AbstractC59759znB implements HttpExecutionAware, AbortableHttpRequest, Cloneable, InterfaceC59577zjf {
    private final AtomicBoolean aborted = new AtomicBoolean(false);
    private final AtomicReference<InterfaceC59546zjA> cancellableRef = new AtomicReference<>(null);

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setConnectionRequest(final InterfaceC59558zjM interfaceC59558zjM) {
        setCancellable(new InterfaceC59546zjA() { // from class: org.apache.http.client.methods.AbstractExecutionAwareRequest.1
            @Override // o.InterfaceC59546zjA
            public boolean cancel() {
                interfaceC59558zjM.OLrzqt();
                return true;
            }
        });
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setReleaseTrigger(final InterfaceC59556zjK interfaceC59556zjK) {
        setCancellable(new InterfaceC59546zjA() { // from class: org.apache.http.client.methods.AbstractExecutionAwareRequest.2
            @Override // o.InterfaceC59546zjA
            public boolean cancel() {
                try {
                    interfaceC59556zjK.bZ_();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        });
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    public void abort() {
        InterfaceC59546zjA andSet;
        if (!this.aborted.compareAndSet(false, true) || (andSet = this.cancellableRef.getAndSet(null)) == null) {
            return;
        }
        andSet.cancel();
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public boolean isAborted() {
        return this.aborted.get();
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public void setCancellable(InterfaceC59546zjA interfaceC59546zjA) {
        if (this.aborted.get()) {
            return;
        }
        this.cancellableRef.set(interfaceC59546zjA);
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractExecutionAwareRequest abstractExecutionAwareRequest = (AbstractExecutionAwareRequest) super.clone();
        abstractExecutionAwareRequest.headergroup = (HeaderGroup) CloneUtils.cloneObject(this.headergroup);
        abstractExecutionAwareRequest.params = (InterfaceC59779znV) CloneUtils.cloneObject(this.params);
        return abstractExecutionAwareRequest;
    }

    public void completed() {
        this.cancellableRef.set(null);
    }

    public void reset() {
        InterfaceC59546zjA andSet = this.cancellableRef.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        this.aborted.set(false);
    }
}
