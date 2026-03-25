package o;

import com.amplitude.common.Logger;
import com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3;
import com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1;
import com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2;
import com.amplitude.core.utilities.FileResponseHandler$handleSuccessResponse$1;
import com.amplitude.core.utilities.FileResponseHandler$triggerBackOff$1;
import com.amplitude.core.utilities.http.HttpStatus;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class KS implements InterfaceC5274Lk {
    public int AEQbTJ;
    public final int AYXKKw;
    public final Logger AhwBna;
    public long EZpvd;
    public AtomicBoolean KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C5244Kg copydefault;
    public final CoroutineScope djBIcL;
    public AtomicInteger gEmmrt;
    public final C5255Kr valueOf;
    public final KO values;

    public KS(@NotNull KO ko, @NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher, Logger logger) {
        Intrinsics.checkNotNullParameter(ko, "");
        Intrinsics.checkNotNullParameter(c5255Kr, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.values = ko;
        this.valueOf = c5255Kr;
        this.copydefault = c5244Kg;
        this.djBIcL = coroutineScope;
        this.OLrzqt = coroutineDispatcher;
        this.AhwBna = logger;
        this.gEmmrt = new AtomicInteger(0);
        this.EZpvd = c5244Kg.AhwBna();
        this.KWHzl = new AtomicBoolean(false);
        this.AEQbTJ = c5244Kg.AYXKKw();
        this.AYXKKw = 50;
    }

    public final void AEQbTJ(long j) {
        this.EZpvd = j;
        this.valueOf.copydefault(j);
    }

    public final void copydefault(int i) {
        this.AEQbTJ = i;
        this.valueOf.KWHzl(i);
    }

    @Override // o.InterfaceC5274Lk
    public void OLrzqt(@NotNull C5271Lh c5271Lh, @NotNull java.lang.Object obj, @NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(c5271Lh, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = (java.lang.String) obj;
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5271Lh.OLrzqt());
        }
        try {
            EZpvd(KX.AEQbTJ(new JSONArray(str)), HttpStatus.SUCCESS.getCode(), "Event sent success.");
            BuildersKt__Builders_commonKt.launch$default(this.djBIcL, this.OLrzqt, null, new FileResponseHandler$handleSuccessResponse$1(this, str2, null), 2, null);
            KWHzl();
        } catch (JSONException e) {
            this.values.EZpvd(str2);
            EZpvd(str);
            throw e;
        }
    }

    @Override // o.InterfaceC5274Lk
    public void copydefault(@NotNull C5267Ld c5267Ld, @NotNull java.lang.Object obj, @NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(c5267Ld, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5267Ld.OLrzqt() + ", error: " + c5267Ld.EZpvd());
        }
        java.lang.String str2 = (java.lang.String) obj;
        try {
            java.util.List<C5242Ke> listAEQbTJ = KX.AEQbTJ(new JSONArray(str));
            if (listAEQbTJ.size() == 1 || c5267Ld.AEQbTJ()) {
                EZpvd(listAEQbTJ, HttpStatus.BAD_REQUEST.getCode(), c5267Ld.EZpvd());
                this.values.EZpvd(str2);
                return;
            }
            java.util.Set<java.lang.Integer> setKWHzl = c5267Ld.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i = 0;
            for (java.lang.Object obj2 : listAEQbTJ) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C5242Ke c5242Ke = (C5242Ke) obj2;
                if (setKWHzl.contains(java.lang.Integer.valueOf(i)) || c5267Ld.KWHzl(c5242Ke)) {
                    arrayList.add(c5242Ke);
                } else {
                    arrayList2.add(c5242Ke);
                }
                i++;
            }
            EZpvd(arrayList, HttpStatus.BAD_REQUEST.getCode(), c5267Ld.EZpvd());
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.valueOf.EZpvd((C5242Ke) it.next());
            }
            BuildersKt__Builders_commonKt.launch$default(this.djBIcL, this.OLrzqt, null, new FileResponseHandler$handleBadRequestResponse$3(this, str2, null), 2, null);
            KWHzl(false);
        } catch (JSONException e) {
            this.values.EZpvd(str2);
            EZpvd(str);
            throw e;
        }
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5273Lj c5273Lj, @NotNull java.lang.Object obj, @NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(c5273Lj, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5273Lj.AEQbTJ() + ", error: " + c5273Lj.EZpvd());
        }
        java.lang.String str2 = (java.lang.String) obj;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 1) {
                BuildersKt__Builders_commonKt.launch$default(this.djBIcL, this.OLrzqt, null, new FileResponseHandler$handlePayloadTooLargeResponse$2(this, str2, jSONArray, null), 2, null);
                KWHzl(false);
            } else {
                EZpvd(KX.AEQbTJ(jSONArray), HttpStatus.PAYLOAD_TOO_LARGE.getCode(), c5273Lj.EZpvd());
                BuildersKt__Builders_commonKt.launch$default(this.djBIcL, this.OLrzqt, null, new FileResponseHandler$handlePayloadTooLargeResponse$1(this, str2, null), 2, null);
            }
        } catch (JSONException e) {
            this.values.EZpvd(str2);
            EZpvd(str);
            throw e;
        }
    }

    @Override // o.InterfaceC5274Lk
    public void OLrzqt(@NotNull C5275Ll c5275Ll, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5275Ll, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5275Ll.KWHzl() + ", error: " + c5275Ll.AEQbTJ());
        }
        this.values.copydefault((java.lang.String) obj);
        KWHzl(true);
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5270Lg c5270Lg, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5270Lg, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5270Lg.OLrzqt());
        }
        this.values.copydefault((java.lang.String) obj);
        KWHzl(true);
    }

    @Override // o.InterfaceC5274Lk
    public void AEQbTJ(@NotNull C5269Lf c5269Lf, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5269Lf, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Handle response, status: " + c5269Lf.KWHzl() + ", error: " + c5269Lf.OLrzqt());
        }
        this.values.copydefault((java.lang.String) obj);
        KWHzl(true);
    }

    public final void EZpvd(java.lang.String str) {
        java.util.Iterator it = Regex.findAll$default(new Regex("\"insert_id\":\"(.{36})\","), str, 0, 2, null).iterator();
        while (it.hasNext()) {
            this.values.AEQbTJ(((MatchResult) it.next()).OLrzqt().get(1));
        }
    }

    public static /* synthetic */ void triggerBackOff$default(KS ks, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        ks.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        Logger logger = this.AhwBna;
        if (logger != null) {
            logger.OLrzqt("Back off to retry sending events later.");
        }
        this.KWHzl.set(true);
        if (this.gEmmrt.incrementAndGet() <= this.copydefault.gEmmrt()) {
            AEQbTJ(this.EZpvd * ((long) 2));
            if (z) {
                copydefault(C56548yJl.valueOf(this.AEQbTJ * 2, this.AYXKKw));
                return;
            }
            return;
        }
        this.valueOf.EZpvd(true);
        Logger logger2 = this.AhwBna;
        if (logger2 != null) {
            logger2.OLrzqt("Max retries " + this.copydefault.gEmmrt() + " exceeded, temporarily stop scheduling new events sending out.");
        }
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, this.OLrzqt, null, new FileResponseHandler$triggerBackOff$1(this, null), 2, null);
    }

    public final void KWHzl() {
        if (this.KWHzl.get()) {
            this.KWHzl.set(false);
            this.gEmmrt.getAndSet(0);
            AEQbTJ(this.copydefault.AhwBna());
            copydefault(this.copydefault.AYXKKw());
            this.valueOf.EZpvd(false);
        }
    }

    public final void EZpvd(java.util.List<? extends C5242Ke> list, int i, java.lang.String str) {
        yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoOLrzqt;
        for (C5242Ke c5242Ke : list) {
            yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoKWHzl = this.copydefault.KWHzl();
            if (yhoKWHzl != null) {
                yhoKWHzl.invoke(c5242Ke, java.lang.Integer.valueOf(i), str);
            }
            java.lang.String strAubY = c5242Ke.AubY();
            if (strAubY != null && (yhoOLrzqt = this.values.OLrzqt(strAubY)) != null) {
                yhoOLrzqt.invoke(c5242Ke, java.lang.Integer.valueOf(i), str);
                this.values.AEQbTJ(strAubY);
            }
        }
    }
}
