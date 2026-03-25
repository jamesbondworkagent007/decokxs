package o;

import com.amplitude.android.AutocaptureOption;
import com.amplitude.android.Timeline$processEventMessage$1;
import com.amplitude.android.Timeline$start$1;
import com.amplitude.android.Timeline$startNewSession$1;
import com.amplitude.android.Timeline$startNewSessionIfNeeded$1;
import com.amplitude.core.Storage;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5219Jh extends C5260Kw {
    public long AEQbTJ;
    public long AhwBna;
    public boolean EZpvd;
    public final AtomicLong KWHzl;
    public final kotlinx.coroutines.channels.Channel<C5217Jf> OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5219Jh() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.AhwBna = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r1v0 java.lang.Long))
 A[MD:(java.lang.Long):void (m)] (LINE:10) call: o.Jh.<init>(java.lang.Long):void type: THIS */
    public /* synthetic */ C5219Jh(java.lang.Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }

    public C5219Jh(java.lang.Long l) {
        this.copydefault = l;
        this.OLrzqt = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.KWHzl = new AtomicLong(l != null ? l.longValue() : -1L);
        this.AhwBna = -1L;
    }

    public final long AEQbTJ() {
        return this.KWHzl.get();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(copydefault().AYXKKw(), copydefault().fJNWhG(), null, new Timeline$start$1(this, null), 2, null);
    }

    public final void EZpvd() {
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.OLrzqt, (CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // o.C5260Kw
    public void copydefault(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        if (c5242Ke.RJOkX() == null) {
            c5242Ke.copydefault(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        this.OLrzqt.mo5769trySendJP2dKIU(new C5217Jf(c5242Ke));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(C5217Jf c5217Jf, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Timeline$processEventMessage$1 timeline$processEventMessage$1;
        C5242Ke c5242KeOLrzqt;
        C5219Jh c5219Jh;
        C5219Jh c5219Jh2;
        C5219Jh c5219Jh3;
        int i;
        C5219Jh c5219Jh4;
        C5242Ke c5242Ke;
        long j;
        C5242Ke c5242Ke2;
        C5219Jh c5219Jh5;
        long j2;
        C5219Jh c5219Jh6;
        int i2;
        C5242Ke c5242Ke3;
        java.lang.Iterable iterable;
        if (continuation instanceof Timeline$processEventMessage$1) {
            timeline$processEventMessage$1 = (Timeline$processEventMessage$1) continuation;
            int i3 = timeline$processEventMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                timeline$processEventMessage$1.label = i3 - Integer.MIN_VALUE;
            } else {
                timeline$processEventMessage$1 = new Timeline$processEventMessage$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = timeline$processEventMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = 1;
        int i5 = 0;
        java.lang.Iterable<C5242Ke> iterable2 = null;
        switch (timeline$processEventMessage$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                c5242KeOLrzqt = c5217Jf.OLrzqt();
                java.lang.Long lRJOkX = c5242KeOLrzqt.RJOkX();
                Intrinsics.copydefault(lRJOkX);
                long jLongValue = lRJOkX.longValue();
                java.lang.Long lQUSxYX = c5242KeOLrzqt.QUSxYX();
                if (Intrinsics.EZpvd((java.lang.Object) c5242KeOLrzqt.copydefault(), (java.lang.Object) "session_start")) {
                    long jLongValue2 = lQUSxYX != null ? lQUSxYX.longValue() : jLongValue;
                    timeline$processEventMessage$1.L$0 = this;
                    timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                    timeline$processEventMessage$1.J$0 = jLongValue;
                    timeline$processEventMessage$1.I$0 = 0;
                    timeline$processEventMessage$1.label = 1;
                    if (copydefault(jLongValue2, timeline$processEventMessage$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    i = 0;
                    c5219Jh4 = this;
                    c5242Ke = c5242KeOLrzqt;
                    j = jLongValue;
                    timeline$processEventMessage$1.L$0 = c5219Jh4;
                    timeline$processEventMessage$1.L$1 = c5242Ke;
                    timeline$processEventMessage$1.I$0 = i;
                    timeline$processEventMessage$1.label = 2;
                    if (c5219Jh4.KWHzl(j, timeline$processEventMessage$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    c5242Ke2 = c5242Ke;
                    C5219Jh c5219Jh7 = c5219Jh4;
                    i5 = i;
                    c5219Jh5 = c5219Jh7;
                    c5242KeOLrzqt = c5242Ke2;
                    c5219Jh = c5219Jh5;
                    if (i5 == 0 && c5242KeOLrzqt.QUSxYX() == null) {
                        c5242KeOLrzqt.KWHzl(C56443yFo.KWHzl(c5219Jh.AEQbTJ()));
                    }
                    j2 = c5219Jh.AEQbTJ;
                    if (iterable2 != null) {
                        for (C5242Ke c5242Ke4 : iterable2) {
                            if (c5242Ke4.hDKMBd() == null) {
                                long j3 = c5219Jh.AEQbTJ + 1;
                                c5242Ke4.EZpvd(C56443yFo.KWHzl(j3));
                                c5219Jh.AEQbTJ = j3;
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                    if (i5 == 0 && c5242KeOLrzqt.hDKMBd() == null) {
                        long j4 = c5219Jh.AEQbTJ + 1;
                        c5242KeOLrzqt.EZpvd(C56443yFo.KWHzl(j4));
                        c5219Jh.AEQbTJ = j4;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (c5219Jh.AEQbTJ > j2) {
                        Storage storageFIwbmz = c5219Jh.copydefault().fIwbmz();
                        Storage.Constants constants = Storage.Constants.LAST_EVENT_ID;
                        long j5 = c5219Jh.AEQbTJ;
                        timeline$processEventMessage$1.L$0 = c5219Jh;
                        timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                        timeline$processEventMessage$1.L$2 = iterable2;
                        timeline$processEventMessage$1.I$0 = i5;
                        timeline$processEventMessage$1.label = 7;
                        if (storageFIwbmz.EZpvd(constants, java.lang.String.valueOf(j5), timeline$processEventMessage$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        c5219Jh6 = c5219Jh;
                        i2 = i5;
                        c5242Ke3 = c5242KeOLrzqt;
                        iterable = iterable2;
                        i5 = i2;
                        iterable2 = iterable;
                        c5242KeOLrzqt = c5242Ke3;
                        c5219Jh = c5219Jh6;
                    }
                    if (iterable2 != null) {
                        java.util.Iterator it = iterable2.iterator();
                        while (it.hasNext()) {
                            super.copydefault((C5242Ke) it.next());
                        }
                    }
                    if (i5 == 0) {
                        super.copydefault(c5242KeOLrzqt);
                    }
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) c5242KeOLrzqt.copydefault(), (java.lang.Object) "session_end")) {
                    if (Intrinsics.EZpvd((java.lang.Object) c5242KeOLrzqt.copydefault(), (java.lang.Object) "dummy_enter_foreground")) {
                        timeline$processEventMessage$1.L$0 = this;
                        timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                        timeline$processEventMessage$1.I$0 = 1;
                        timeline$processEventMessage$1.label = 3;
                        objEZpvd = EZpvd(jLongValue, timeline$processEventMessage$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        c5219Jh3 = this;
                        i5 = 1;
                        c5219Jh3.EZpvd = true;
                        c5219Jh = c5219Jh3;
                        iterable2 = (java.lang.Iterable) objEZpvd;
                        if (i5 == 0) {
                            c5242KeOLrzqt.KWHzl(C56443yFo.KWHzl(c5219Jh.AEQbTJ()));
                        }
                        j2 = c5219Jh.AEQbTJ;
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                            long j42 = c5219Jh.AEQbTJ + 1;
                            c5242KeOLrzqt.EZpvd(C56443yFo.KWHzl(j42));
                            c5219Jh.AEQbTJ = j42;
                            Unit unit22 = Unit.INSTANCE;
                        }
                        if (c5219Jh.AEQbTJ > j2) {
                        }
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) c5242KeOLrzqt.copydefault(), (java.lang.Object) "dummy_exit_foreground")) {
                        timeline$processEventMessage$1.L$0 = this;
                        timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                        timeline$processEventMessage$1.I$0 = 1;
                        timeline$processEventMessage$1.label = 4;
                        if (KWHzl(jLongValue, timeline$processEventMessage$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        c5219Jh2 = this;
                        c5219Jh2.EZpvd = false;
                        i5 = i4;
                        c5219Jh = c5219Jh2;
                        if (i5 == 0) {
                        }
                        j2 = c5219Jh.AEQbTJ;
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                        }
                        if (c5219Jh.AEQbTJ > j2) {
                        }
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (!this.EZpvd) {
                        timeline$processEventMessage$1.L$0 = this;
                        timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                        timeline$processEventMessage$1.I$0 = 0;
                        timeline$processEventMessage$1.label = 5;
                        objEZpvd = EZpvd(jLongValue, timeline$processEventMessage$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        c5219Jh = this;
                        iterable2 = (java.lang.Iterable) objEZpvd;
                        if (i5 == 0) {
                        }
                        j2 = c5219Jh.AEQbTJ;
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                        }
                        if (c5219Jh.AEQbTJ > j2) {
                        }
                        if (iterable2 != null) {
                        }
                        if (i5 == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    timeline$processEventMessage$1.L$0 = this;
                    timeline$processEventMessage$1.L$1 = c5242KeOLrzqt;
                    timeline$processEventMessage$1.I$0 = 0;
                    timeline$processEventMessage$1.label = 6;
                    if (KWHzl(jLongValue, timeline$processEventMessage$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                c5219Jh = this;
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 1:
                int i6 = timeline$processEventMessage$1.I$0;
                j = timeline$processEventMessage$1.J$0;
                c5242Ke = (C5242Ke) timeline$processEventMessage$1.L$1;
                C5219Jh c5219Jh8 = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                i = i6;
                c5219Jh4 = c5219Jh8;
                timeline$processEventMessage$1.L$0 = c5219Jh4;
                timeline$processEventMessage$1.L$1 = c5242Ke;
                timeline$processEventMessage$1.I$0 = i;
                timeline$processEventMessage$1.label = 2;
                if (c5219Jh4.KWHzl(j, timeline$processEventMessage$1) != objCopydefault) {
                }
                break;
            case 2:
                int i7 = timeline$processEventMessage$1.I$0;
                c5242Ke2 = (C5242Ke) timeline$processEventMessage$1.L$1;
                C5219Jh c5219Jh9 = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c5219Jh5 = c5219Jh9;
                i5 = i7;
                c5242KeOLrzqt = c5242Ke2;
                c5219Jh = c5219Jh5;
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 3:
                int i8 = timeline$processEventMessage$1.I$0;
                C5242Ke c5242Ke5 = (C5242Ke) timeline$processEventMessage$1.L$1;
                c5219Jh3 = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                i5 = i8;
                c5242KeOLrzqt = c5242Ke5;
                c5219Jh3.EZpvd = true;
                c5219Jh = c5219Jh3;
                iterable2 = (java.lang.Iterable) objEZpvd;
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 4:
                i4 = timeline$processEventMessage$1.I$0;
                c5242KeOLrzqt = (C5242Ke) timeline$processEventMessage$1.L$1;
                c5219Jh2 = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c5219Jh2.EZpvd = false;
                i5 = i4;
                c5219Jh = c5219Jh2;
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 5:
                i5 = timeline$processEventMessage$1.I$0;
                c5242KeOLrzqt = (C5242Ke) timeline$processEventMessage$1.L$1;
                c5219Jh = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                iterable2 = (java.lang.Iterable) objEZpvd;
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 6:
                i5 = timeline$processEventMessage$1.I$0;
                c5242KeOLrzqt = (C5242Ke) timeline$processEventMessage$1.L$1;
                c5219Jh = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                if (i5 == 0) {
                }
                j2 = c5219Jh.AEQbTJ;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                if (c5219Jh.AEQbTJ > j2) {
                }
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 7:
                i2 = timeline$processEventMessage$1.I$0;
                iterable = (java.lang.Iterable) timeline$processEventMessage$1.L$2;
                c5242Ke3 = (C5242Ke) timeline$processEventMessage$1.L$1;
                c5219Jh6 = (C5219Jh) timeline$processEventMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                i5 = i2;
                iterable2 = iterable;
                c5242KeOLrzqt = c5242Ke3;
                c5219Jh = c5219Jh6;
                if (iterable2 != null) {
                }
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, Continuation<? super java.lang.Iterable<? extends C5242Ke>> continuation) throws java.lang.Throwable {
        Timeline$startNewSessionIfNeeded$1 timeline$startNewSessionIfNeeded$1;
        if (continuation instanceof Timeline$startNewSessionIfNeeded$1) {
            timeline$startNewSessionIfNeeded$1 = (Timeline$startNewSessionIfNeeded$1) continuation;
            int i = timeline$startNewSessionIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$startNewSessionIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                timeline$startNewSessionIfNeeded$1 = new Timeline$startNewSessionIfNeeded$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = timeline$startNewSessionIfNeeded$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = timeline$startNewSessionIfNeeded$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (OLrzqt() && AEQbTJ(j)) {
                timeline$startNewSessionIfNeeded$1.label = 1;
                if (KWHzl(j, timeline$startNewSessionIfNeeded$1) == objCopydefault) {
                    return objCopydefault;
                }
                return null;
            }
            timeline$startNewSessionIfNeeded$1.label = 2;
            objAEQbTJ = AEQbTJ(j, timeline$startNewSessionIfNeeded$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                return null;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return objAEQbTJ;
    }

    public final java.lang.Object copydefault(long j, Continuation<? super Unit> continuation) {
        this.KWHzl.set(j);
        java.lang.Object objEZpvd = copydefault().fIwbmz().EZpvd(Storage.Constants.PREVIOUS_SESSION_ID, java.lang.String.valueOf(AEQbTJ()), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, Continuation<? super java.lang.Iterable<? extends C5242Ke>> continuation) throws java.lang.Throwable {
        Timeline$startNewSession$1 timeline$startNewSession$1;
        java.util.List arrayList;
        boolean zContains;
        C5219Jh c5219Jh;
        C5219Jh c5219Jh2;
        java.util.List list;
        boolean z;
        long j2;
        if (continuation instanceof Timeline$startNewSession$1) {
            timeline$startNewSession$1 = (Timeline$startNewSession$1) continuation;
            int i = timeline$startNewSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$startNewSession$1.label = i - Integer.MIN_VALUE;
            } else {
                timeline$startNewSession$1 = new Timeline$startNewSession$1(this, continuation);
            }
        }
        java.lang.Object obj = timeline$startNewSession$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = timeline$startNewSession$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new java.util.ArrayList();
            C5244Kg c5244KgDjBIcL = copydefault().djBIcL();
            Intrinsics.copydefault(c5244KgDjBIcL, "");
            zContains = ((C5216Je) c5244KgDjBIcL).AEQbTJ().contains(AutocaptureOption.SESSIONS);
            if (zContains && OLrzqt()) {
                C5242Ke c5242Ke = new C5242Ke();
                c5242Ke.OLrzqt("session_end");
                long j3 = this.AhwBna;
                c5242Ke.copydefault(j3 > 0 ? C56443yFo.KWHzl(j3) : null);
                c5242Ke.KWHzl(C56443yFo.KWHzl(AEQbTJ()));
                arrayList.add(c5242Ke);
            }
            timeline$startNewSession$1.L$0 = this;
            timeline$startNewSession$1.L$1 = arrayList;
            timeline$startNewSession$1.J$0 = j;
            timeline$startNewSession$1.Z$0 = zContains;
            timeline$startNewSession$1.label = 1;
            if (copydefault(j, timeline$startNewSession$1) == objCopydefault) {
                return objCopydefault;
            }
            c5219Jh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = timeline$startNewSession$1.Z$0;
                j2 = timeline$startNewSession$1.J$0;
                list = (java.util.List) timeline$startNewSession$1.L$1;
                c5219Jh2 = (C5219Jh) timeline$startNewSession$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (z) {
                    C5242Ke c5242Ke2 = new C5242Ke();
                    c5242Ke2.OLrzqt("session_start");
                    c5242Ke2.copydefault(C56443yFo.KWHzl(j2));
                    c5242Ke2.KWHzl(C56443yFo.KWHzl(c5219Jh2.AEQbTJ()));
                    list.add(c5242Ke2);
                }
                return list;
            }
            boolean z2 = timeline$startNewSession$1.Z$0;
            long j4 = timeline$startNewSession$1.J$0;
            java.util.List list2 = (java.util.List) timeline$startNewSession$1.L$1;
            C5219Jh c5219Jh3 = (C5219Jh) timeline$startNewSession$1.L$0;
            C56391yDq.AEQbTJ(obj);
            arrayList = list2;
            zContains = z2;
            j = j4;
            c5219Jh = c5219Jh3;
        }
        timeline$startNewSession$1.L$0 = c5219Jh;
        timeline$startNewSession$1.L$1 = arrayList;
        timeline$startNewSession$1.J$0 = j;
        timeline$startNewSession$1.Z$0 = zContains;
        timeline$startNewSession$1.label = 2;
        if (c5219Jh.KWHzl(j, timeline$startNewSession$1) == objCopydefault) {
            return objCopydefault;
        }
        c5219Jh2 = c5219Jh;
        long j5 = j;
        list = arrayList;
        z = zContains;
        j2 = j5;
        if (z) {
        }
        return list;
    }

    public final java.lang.Object KWHzl(long j, Continuation<? super Unit> continuation) {
        if (!OLrzqt()) {
            return Unit.INSTANCE;
        }
        this.AhwBna = j;
        java.lang.Object objEZpvd = copydefault().fIwbmz().EZpvd(Storage.Constants.LAST_EVENT_TIME, java.lang.String.valueOf(this.AhwBna), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final boolean AEQbTJ(long j) {
        C5244Kg c5244KgDjBIcL = copydefault().djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        return j - this.AhwBna < ((C5216Je) c5244KgDjBIcL).fARcdN();
    }

    public final boolean OLrzqt() {
        return AEQbTJ() >= 0;
    }
}
