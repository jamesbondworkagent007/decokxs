package org.apache.http.client.protocol;

import java.util.Queue;
import o.C59590zjs;
import o.C59593zjv;
import o.C59849zom;
import o.InterfaceC59499ziG;
import o.InterfaceC59518ziZ;
import o.InterfaceC59547zjB;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59588zjq;
import o.InterfaceC59597zjz;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthenticationException;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
abstract class RequestAuthenticationBase implements InterfaceC59580zji {
    final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    public void process(C59593zjv c59593zjv, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) {
        InterfaceC59588zjq interfaceC59588zjqKWHzl = c59593zjv.KWHzl();
        InterfaceC59597zjz interfaceC59597zjzAEQbTJ = c59593zjv.AEQbTJ();
        int i = AnonymousClass1.$SwitchMap$org$apache$http$auth$AuthProtocolState[c59593zjv.copydefault().ordinal()];
        if (i != 1) {
            if (i == 2) {
                ensureAuthScheme(interfaceC59588zjqKWHzl);
                if (interfaceC59588zjqKWHzl.isConnectionBased()) {
                    return;
                }
            } else if (i == 3) {
                Queue<C59590zjs> queueEZpvd = c59593zjv.EZpvd();
                if (queueEZpvd != null) {
                    while (!queueEZpvd.isEmpty()) {
                        C59590zjs c59590zjsRemove = queueEZpvd.remove();
                        InterfaceC59588zjq interfaceC59588zjqAEQbTJ = c59590zjsRemove.AEQbTJ();
                        InterfaceC59597zjz interfaceC59597zjzCopydefault = c59590zjsRemove.copydefault();
                        c59593zjv.AEQbTJ(interfaceC59588zjqAEQbTJ, interfaceC59597zjzCopydefault);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Generating response to an authentication challenge using " + interfaceC59588zjqAEQbTJ.getSchemeName() + " scheme");
                        }
                        try {
                            interfaceC59577zjf.addHeader(authenticate(interfaceC59588zjqAEQbTJ, interfaceC59597zjzCopydefault, interfaceC59577zjf, interfaceC59838zob));
                            return;
                        } catch (AuthenticationException e) {
                            if (this.log.isWarnEnabled()) {
                                this.log.warn(interfaceC59588zjqAEQbTJ + " authentication error: " + e.getMessage());
                            }
                        }
                    }
                    return;
                }
                ensureAuthScheme(interfaceC59588zjqKWHzl);
            }
            if (interfaceC59588zjqKWHzl != null) {
                try {
                    interfaceC59577zjf.addHeader(authenticate(interfaceC59588zjqKWHzl, interfaceC59597zjzAEQbTJ, interfaceC59577zjf, interfaceC59838zob));
                } catch (AuthenticationException e2) {
                    if (this.log.isErrorEnabled()) {
                        this.log.error(interfaceC59588zjqKWHzl + " authentication error: " + e2.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.apache.http.client.protocol.RequestAuthenticationBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            $SwitchMap$org$apache$http$auth$AuthProtocolState = iArr;
            try {
                iArr[AuthProtocolState.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.CHALLENGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void ensureAuthScheme(InterfaceC59588zjq interfaceC59588zjq) {
        C59849zom.AEQbTJ(interfaceC59588zjq, "Auth scheme");
    }

    private InterfaceC59518ziZ authenticate(InterfaceC59588zjq interfaceC59588zjq, InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        C59849zom.AEQbTJ(interfaceC59588zjq, "Auth scheme");
        if (interfaceC59588zjq instanceof InterfaceC59547zjB) {
            return ((InterfaceC59547zjB) interfaceC59588zjq).authenticate(interfaceC59597zjz, interfaceC59577zjf, interfaceC59838zob);
        }
        return interfaceC59588zjq.authenticate(interfaceC59597zjz, interfaceC59577zjf);
    }
}
