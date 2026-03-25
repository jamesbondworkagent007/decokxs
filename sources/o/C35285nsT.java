package o;

import androidx.core.view.MenuProvider;
import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: renamed from: o.nsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35285nsT {
    public static final int copydefault = 8;
    public MutableSharedFlow<AbstractC35278nsM<?>> AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public boolean DbNXlk;
    public final MutableSharedFlow<AbstractC35278nsM<?>> EZpvd;
    public MutableSharedFlow<java.lang.String> KWHzl;
    public MutableSharedFlow<MenuProvider> OLrzqt;
    public MutableSharedFlow<AbstractC35352nth<?>> djBIcL;
    public final SharedFlow<AbstractC35278nsM<?>> ejfBZ;
    public InterfaceC35283nsR fARcdN;
    public final SharedFlow<AbstractC35278nsM<?>> fIwbmz;
    public final SharedFlow<MenuProvider> fJNWhG;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public Function1<? super C35354ntj, ? extends C35346ntb> getFieldNames;
    public Function1<? super Continuation<? super GeneralAction>, ? extends java.lang.Object> getNewProxyInstance;
    public final SharedFlow<java.lang.String> hDKMBd;
    public boolean isConnected;
    public final SharedFlow<AbstractC35352nth<?>> iwGUEr;
    public boolean valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC35283nsR interfaceC35283nsR) {
        this.fARcdN = interfaceC35283nsR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC35352nth<?>> AYXKKw() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC35278nsM<?>> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.okinc.im.config.serviceprovider.GeneralAction>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.okinc.im.config.serviceprovider.GeneralAction>, java.lang.Object> */
    public final Function1<Continuation<? super GeneralAction>, java.lang.Object> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> fetchVPNInfo() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ntj, ? extends o.ntb>, kotlin.jvm.functions.Function1<o.ntj, o.ntb> */
    public final Function1<C35354ntj, C35346ntb> gEmmrt() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC35278nsM<?>> valueOf() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.DbNXlk;
    }

    public C35285nsT() {
        MutableSharedFlow<AbstractC35278nsM<?>> mutableSharedFlowOLrzqt = C35286nsU.OLrzqt(null);
        this.EZpvd = mutableSharedFlowOLrzqt;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt);
        MutableSharedFlow<AbstractC35278nsM<?>> mutableSharedFlowOLrzqt2 = C35286nsU.OLrzqt(null);
        this.AEQbTJ = mutableSharedFlowOLrzqt2;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt2);
        MutableSharedFlow<AbstractC35352nth<?>> mutableSharedFlowOLrzqt3 = C35286nsU.OLrzqt(null);
        this.djBIcL = mutableSharedFlowOLrzqt3;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt3);
        MutableSharedFlow<java.lang.String> mutableSharedFlowOLrzqt4 = C35286nsU.OLrzqt(null);
        this.KWHzl = mutableSharedFlowOLrzqt4;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt4);
        MutableSharedFlow<MenuProvider> mutableSharedFlowOLrzqt5 = C35286nsU.OLrzqt(null);
        this.OLrzqt = mutableSharedFlowOLrzqt5;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt5);
        this.values = true;
        this.AhwBna = true;
        this.valueOf = true;
        this.gEmmrt = true;
        this.AYXKKw = true;
    }
}
