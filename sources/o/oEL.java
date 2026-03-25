package o;

import com.okinc.im.usecase.messagelist.AddMessageToUiMessageListUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oEL {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final oGG EZpvd;

    @yCM
    public oEL(@NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(ogg, "");
        this.EZpvd = ogg;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [15=4] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, boolean z, @NotNull java.util.List<C35254nrp> list, int i, @NotNull OKMessage oKMessage, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AddMessageToUiMessageListUseCase$execute$1 addMessageToUiMessageListUseCase$execute$1;
        AddMessageToUiMessageListUseCase$execute$1 addMessageToUiMessageListUseCase$execute$12;
        java.lang.Object obj;
        oEL oel;
        java.lang.Object obj2;
        java.util.List list2;
        int i2;
        java.util.List<C35254nrp> list3;
        boolean z2;
        C36558odI c36558odI2;
        int i3;
        C36558odI c36558odI3;
        int i4;
        java.util.List list4;
        C35254nrp c35254nrp;
        int i5;
        java.util.List<C35254nrp> list5;
        oEL oel2;
        java.util.List<C35254nrp> list6;
        java.util.List list7;
        C35254nrp c35254nrp2;
        C35254nrp c35254nrp3;
        if (continuation instanceof AddMessageToUiMessageListUseCase$execute$1) {
            addMessageToUiMessageListUseCase$execute$1 = (AddMessageToUiMessageListUseCase$execute$1) continuation;
            int i6 = addMessageToUiMessageListUseCase$execute$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                addMessageToUiMessageListUseCase$execute$1.label = i6 - Integer.MIN_VALUE;
            } else {
                addMessageToUiMessageListUseCase$execute$1 = new AddMessageToUiMessageListUseCase$execute$1(this, continuation);
            }
        }
        AddMessageToUiMessageListUseCase$execute$1 addMessageToUiMessageListUseCase$execute$13 = addMessageToUiMessageListUseCase$execute$1;
        java.lang.Object objAEQbTJ = addMessageToUiMessageListUseCase$execute$13.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = addMessageToUiMessageListUseCase$execute$13.label;
        if (i7 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C35254nrp) it.next()).OLrzqt());
            }
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
            if (z) {
                listFJNWhG.add(i, oKMessage);
            } else {
                listFJNWhG.set(i, oKMessage);
            }
            oGG ogg = this.EZpvd;
            addMessageToUiMessageListUseCase$execute$13.L$0 = this;
            addMessageToUiMessageListUseCase$execute$13.L$1 = c36558odI;
            addMessageToUiMessageListUseCase$execute$13.L$2 = list;
            addMessageToUiMessageListUseCase$execute$13.L$3 = listFJNWhG;
            addMessageToUiMessageListUseCase$execute$13.Z$0 = z;
            addMessageToUiMessageListUseCase$execute$13.I$0 = i;
            addMessageToUiMessageListUseCase$execute$13.label = 1;
            addMessageToUiMessageListUseCase$execute$12 = addMessageToUiMessageListUseCase$execute$13;
            java.lang.Object objAEQbTJ2 = ogg.AEQbTJ(c36558odI, oKMessage, listFJNWhG, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, addMessageToUiMessageListUseCase$execute$13);
            obj = objCopydefault;
            if (objAEQbTJ2 == obj) {
                return obj;
            }
            oel = this;
            obj2 = objAEQbTJ2;
            list2 = listFJNWhG;
            i2 = i;
            list3 = list;
            z2 = z;
            c36558odI2 = c36558odI;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = addMessageToUiMessageListUseCase$execute$13.I$0;
                    list5 = (java.util.List) addMessageToUiMessageListUseCase$execute$13.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    c35254nrp3 = (C35254nrp) objAEQbTJ;
                    if (c35254nrp3 != null) {
                        list5.set(i4, c35254nrp3);
                    }
                    return Unit.INSTANCE;
                }
                i4 = addMessageToUiMessageListUseCase$execute$13.I$1;
                i3 = addMessageToUiMessageListUseCase$execute$13.I$0;
                list7 = (java.util.List) addMessageToUiMessageListUseCase$execute$13.L$3;
                java.util.List<C35254nrp> list8 = (java.util.List) addMessageToUiMessageListUseCase$execute$13.L$2;
                C36558odI c36558odI4 = (C36558odI) addMessageToUiMessageListUseCase$execute$13.L$1;
                oEL oel3 = (oEL) addMessageToUiMessageListUseCase$execute$13.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                oel2 = oel3;
                addMessageToUiMessageListUseCase$execute$12 = addMessageToUiMessageListUseCase$execute$13;
                c36558odI3 = c36558odI4;
                list6 = list8;
                obj = objCopydefault;
                c35254nrp = (C35254nrp) objAEQbTJ;
                list4 = list7;
                oel = oel2;
                i5 = i3;
                list5 = list6;
                if (c35254nrp != null) {
                    list5.set(i5, c35254nrp);
                }
                c35254nrp2 = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(list5, i4);
                if (c35254nrp2 == null) {
                    c35254nrp3 = null;
                    if (c35254nrp3 != null) {
                    }
                    return Unit.INSTANCE;
                }
                oGG ogg2 = oel.EZpvd;
                OKMessage oKMessageOLrzqt = c35254nrp2.OLrzqt();
                addMessageToUiMessageListUseCase$execute$12.L$0 = list5;
                addMessageToUiMessageListUseCase$execute$12.L$1 = null;
                addMessageToUiMessageListUseCase$execute$12.L$2 = null;
                addMessageToUiMessageListUseCase$execute$12.L$3 = null;
                addMessageToUiMessageListUseCase$execute$12.I$0 = i4;
                addMessageToUiMessageListUseCase$execute$12.label = 3;
                objAEQbTJ = ogg2.AEQbTJ(c36558odI3, oKMessageOLrzqt, list4, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, addMessageToUiMessageListUseCase$execute$12);
                if (objAEQbTJ == obj) {
                    return obj;
                }
                c35254nrp3 = (C35254nrp) objAEQbTJ;
                if (c35254nrp3 != null) {
                }
                return Unit.INSTANCE;
            }
            int i8 = addMessageToUiMessageListUseCase$execute$13.I$0;
            z2 = addMessageToUiMessageListUseCase$execute$13.Z$0;
            java.util.List list9 = (java.util.List) addMessageToUiMessageListUseCase$execute$13.L$3;
            java.util.List<C35254nrp> list10 = (java.util.List) addMessageToUiMessageListUseCase$execute$13.L$2;
            C36558odI c36558odI5 = (C36558odI) addMessageToUiMessageListUseCase$execute$13.L$1;
            oEL oel4 = (oEL) addMessageToUiMessageListUseCase$execute$13.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            addMessageToUiMessageListUseCase$execute$12 = addMessageToUiMessageListUseCase$execute$13;
            list2 = list9;
            list3 = list10;
            obj = objCopydefault;
            oel = oel4;
            i2 = i8;
            c36558odI2 = c36558odI5;
            obj2 = objAEQbTJ;
        }
        C35254nrp c35254nrp4 = (C35254nrp) obj2;
        if (z2) {
            list3.add(i2, c35254nrp4);
        } else {
            list3.set(i2, c35254nrp4);
        }
        i3 = i2 - 1;
        int i9 = i2 + 1;
        C35254nrp c35254nrp5 = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(list3, i3);
        if (c35254nrp5 != null) {
            oGG ogg3 = oel.EZpvd;
            OKMessage oKMessageOLrzqt2 = c35254nrp5.OLrzqt();
            addMessageToUiMessageListUseCase$execute$12.L$0 = oel;
            addMessageToUiMessageListUseCase$execute$12.L$1 = c36558odI2;
            addMessageToUiMessageListUseCase$execute$12.L$2 = list3;
            addMessageToUiMessageListUseCase$execute$12.L$3 = list2;
            addMessageToUiMessageListUseCase$execute$12.I$0 = i3;
            addMessageToUiMessageListUseCase$execute$12.I$1 = i9;
            addMessageToUiMessageListUseCase$execute$12.label = 2;
            oel2 = oel;
            java.util.List list11 = list2;
            java.lang.Object objAEQbTJ3 = ogg3.AEQbTJ(c36558odI2, oKMessageOLrzqt2, list2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, addMessageToUiMessageListUseCase$execute$12);
            if (objAEQbTJ3 == obj) {
                return obj;
            }
            c36558odI3 = c36558odI2;
            i4 = i9;
            objAEQbTJ = objAEQbTJ3;
            list6 = list3;
            list7 = list11;
            c35254nrp = (C35254nrp) objAEQbTJ;
            list4 = list7;
            oel = oel2;
            i5 = i3;
            list5 = list6;
            if (c35254nrp != null) {
            }
            c35254nrp2 = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(list5, i4);
            if (c35254nrp2 == null) {
            }
        } else {
            c36558odI3 = c36558odI2;
            i4 = i9;
            list4 = list2;
            c35254nrp = null;
            java.util.List<C35254nrp> list12 = list3;
            i5 = i3;
            list5 = list12;
            if (c35254nrp != null) {
            }
            c35254nrp2 = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(list5, i4);
            if (c35254nrp2 == null) {
            }
        }
    }
}
