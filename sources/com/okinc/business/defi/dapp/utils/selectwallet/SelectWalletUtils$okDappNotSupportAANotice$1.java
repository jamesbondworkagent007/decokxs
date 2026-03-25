package com.okinc.business.defi.dapp.utils.selectwallet;

import android.content.Context;
import com.okinc.business.defi.dapp.net.OKDapp;
import com.okinc.business.defi.dapp.net.SelectWalletNotice;
import com.okinc.business.defi.dapp.utils.selectwallet.SelectWalletUtils$okDappNotSupportAANotice$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43238rlX;
import o.C15115dyI;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC43294rma;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectWalletUtils$okDappNotSupportAANotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SelectWalletNotice>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ OKDapp $okdapp;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectWalletUtils$okDappNotSupportAANotice$1(OKDapp oKDapp, Context context, Continuation<? super SelectWalletUtils$okDappNotSupportAANotice$1> continuation) {
        super(2, continuation);
        this.$okdapp = oKDapp;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectWalletUtils$okDappNotSupportAANotice$1(this.$okdapp, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SelectWalletNotice> continuation) {
        return ((SelectWalletUtils$okDappNotSupportAANotice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref.ObjectRef objectRef;
        Integer numAEQbTJ;
        Integer numAEQbTJ2;
        String strAYXKKw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = this.$okdapp.getDeepLink();
            String category = this.$okdapp.getCategory();
            int iHashCode = category.hashCode();
            if (iHashCode != 49) {
                if (iHashCode != 51) {
                    if (iHashCode == 56 && category.equals("8")) {
                        this.L$0 = objectRef2;
                        this.label = 1;
                        Object objKWHzl = C15115dyI.KWHzl(this);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        objectRef = objectRef2;
                        obj = objKWHzl;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                } else if (category.equals("3")) {
                    this.L$0 = objectRef2;
                    this.label = 2;
                    Object objAEQbTJ = C15115dyI.AEQbTJ(this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef = objectRef2;
                    obj = objAEQbTJ;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else if (category.equals("1")) {
                this.L$0 = objectRef2;
                this.label = 3;
                Object objOLrzqt = C15115dyI.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                obj = objOLrzqt;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            objectRef = objectRef2;
            numAEQbTJ = null;
            numAEQbTJ2 = null;
        } else if (i == 1) {
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.dxcTrN);
                numAEQbTJ2 = null;
            } else {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.fZBcTu);
                numAEQbTJ2 = C56443yFo.AEQbTJ(dLX.Dialog.djSkpj);
            }
        } else if (i == 2) {
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.dvKsVJ);
                numAEQbTJ2 = null;
            } else {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.finit);
                numAEQbTJ2 = C56443yFo.AEQbTJ(dLX.Dialog.UeEOUB);
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.RcXXUw);
                numAEQbTJ2 = null;
            } else {
                numAEQbTJ = C56443yFo.AEQbTJ(dLX.Dialog.fFgQHt);
                numAEQbTJ2 = C56443yFo.AEQbTJ(dLX.Dialog.dNCPSb);
            }
        }
        if (numAEQbTJ == null) {
            return null;
        }
        String strAYXKKw2 = C33070mpX.AYXKKw(numAEQbTJ.intValue());
        if (numAEQbTJ2 == null || (strAYXKKw = C33070mpX.AYXKKw(numAEQbTJ2.intValue())) == null) {
            strAYXKKw = "";
        }
        final Context context = this.$context;
        return new SelectWalletNotice(strAYXKKw2, strAYXKKw, new Function0() { // from class: o.dzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SelectWalletUtils$okDappNotSupportAANotice$1.invokeSuspend$lambda$2(context, objectRef);
            }
        }, C56443yFo.KWHzl(false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$2(Context context, Ref.ObjectRef objectRef) {
        if (context != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, (String) objectRef.element, null, new Function1() { // from class: o.dzJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SelectWalletUtils$okDappNotSupportAANotice$1.invokeSuspend$lambda$2$lambda$1$lambda$0((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1$lambda$0(AbstractC43238rlX abstractC43238rlX) {
        return Unit.INSTANCE;
    }
}
