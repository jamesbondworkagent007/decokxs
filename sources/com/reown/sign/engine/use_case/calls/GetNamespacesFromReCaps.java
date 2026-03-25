package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.sign.common.validator.SignValidator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56423yEv;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetNamespacesFromReCaps {
    public static final Companion Companion = new Companion(null);
    public static final String EIP155 = "eip155";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.use_case.calls.GetNamespacesFromReCaps.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final Map<String, Namespace.Proposal> invoke(@NotNull List<String> list, @NotNull List<String> list2) throws Exception {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant((String) it.next())) {
                    throw new Exception("Chains are not CAIP-2 compliant");
                }
            }
        }
        if (!z || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release((String) it2.next()), (Object) EIP155)) {
                    throw new Exception("Only eip155 (EVM) is supported");
                }
            }
        }
        return C56423yEv.EZpvd(C56390yDp.OLrzqt(SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release((String) CollectionsKt___CollectionsKt.AuCTelauCTel(list)), new Namespace.Proposal(list2, list, yDY.gEmmrt("chainChanged", "accountsChanged"))));
    }
}
