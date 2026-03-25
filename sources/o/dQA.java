package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.jsbridge.JsBridgeAddressBean;
import com.okinc.business.defi.jsbridge.MessageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dQA extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        java.lang.Long genernalChainId;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        final Ref.LongRef longRef = new Ref.LongRef();
        long jLongValue = -1;
        longRef.element = -1L;
        try {
            java.lang.String str = message.data;
            Intrinsics.checkNotNullExpressionValue(str, "");
            MessageData messageData = (MessageData) C33490mxT.EZpvd(str, MessageData.class);
            if (messageData != null && (genernalChainId = messageData.getGenernalChainId()) != null) {
                jLongValue = genernalChainId.longValue();
            }
        } catch (java.lang.Exception unused) {
        }
        longRef.element = jLongValue;
        C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQA.copydefault(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQA.EZpvd(longRef, interfaceC57336ygW, message, (AbstractC12782ctV) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56402yEa.EZpvd(new JsBridgeAddressBean(0L, (java.lang.String) null, 3, (DefaultConstructorMarker) null))));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit EZpvd(Ref.LongRef longRef, InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, AbstractC12782ctV abstractC12782ctV) {
        java.util.Collection collectionEZpvd;
        java.lang.String address;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        long j = longRef.element;
        if (j == -1) {
            java.util.List<ChainAddress> listValueOf = abstractC12782ctV.valueOf();
            collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            for (ChainAddress chainAddress : listValueOf) {
                collectionEZpvd.add(new JsBridgeAddressBean(chainAddress.getCoinId(), chainAddress.getAddress()));
            }
        } else {
            ChainAddress chainAddress2 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, j, null, 2, null);
            if (chainAddress2 != null && (address = chainAddress2.getAddress()) != null) {
                str = address;
            }
            collectionEZpvd = C56402yEa.EZpvd(new JsBridgeAddressBean(str.length() != 0 ? longRef.element : -1L, str));
        }
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(collectionEZpvd));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("getWalletAddressOfChainId", "web3/wallet/js/getWalletAddressOfChainId");
    }
}
