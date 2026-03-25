package o;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C36576oda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C36576oda {
    public final android.os.Handler AEQbTJ;
    public final java.util.HashMap<android.net.Uri, C35249nrk> EZpvd;
    public final java.util.Set<InterfaceC36507ocK> KWHzl;
    public final android.os.Handler OLrzqt;
    public final android.content.Context copydefault;

    @yCM
    public C36576oda(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.EZpvd = new java.util.HashMap<>();
        this.KWHzl = new LinkedHashSet();
        this.AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final C35249nrk AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        android.net.Uri uriOLrzqt = C44169sFw.OLrzqt(oKMessage, this.copydefault);
        if (uriOLrzqt != null) {
            return this.EZpvd.get(uriOLrzqt);
        }
        return null;
    }

    public final void KWHzl(android.net.Uri uri, Function1<? super C35249nrk, C35249nrk> function1) {
        C35249nrk c35249nrk = this.EZpvd.get(uri);
        C35249nrk c35249nrkInvoke = c35249nrk != null ? function1.invoke(c35249nrk) : null;
        this.EZpvd.put(uri, c35249nrkInvoke);
        if (c35249nrkInvoke != null) {
            copydefault(c35249nrkInvoke);
        }
    }

    public final void copydefault(final C35249nrk c35249nrk) {
        for (final InterfaceC36507ocK interfaceC36507ocK : this.KWHzl) {
            this.OLrzqt.post(new java.lang.Runnable() { // from class: o.ocY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36576oda.AEQbTJ(interfaceC36507ocK, c35249nrk);
                }
            });
        }
    }

    public static final void AEQbTJ(InterfaceC36507ocK interfaceC36507ocK, C35249nrk c35249nrk) {
        interfaceC36507ocK.AEQbTJ(c35249nrk);
    }

    public final void EZpvd(@NotNull InterfaceC36507ocK interfaceC36507ocK) {
        Intrinsics.checkNotNullParameter(interfaceC36507ocK, "");
        this.KWHzl.add(interfaceC36507ocK);
    }

    public final void AEQbTJ(@NotNull InterfaceC36507ocK interfaceC36507ocK) {
        Intrinsics.checkNotNullParameter(interfaceC36507ocK, "");
        this.KWHzl.remove(interfaceC36507ocK);
    }

    public final boolean AEQbTJ(@NotNull final android.content.Context context, @NotNull final android.net.Uri uri, @NotNull final C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        return this.AEQbTJ.post(new java.lang.Runnable() { // from class: o.odf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36576oda.AEQbTJ(this.EZpvd, uri, c35254nrp, context);
            }
        });
    }

    public static final void AEQbTJ(C36576oda c36576oda, android.net.Uri uri, C35254nrp c35254nrp, android.content.Context context) {
        java.util.Iterator<Map.Entry<android.net.Uri, C35249nrk>> it = c36576oda.EZpvd.entrySet().iterator();
        while (it.hasNext()) {
            android.net.Uri key = it.next().getKey();
            if (!Intrinsics.EZpvd(key, uri)) {
                c36576oda.KWHzl(key, new Function1() { // from class: o.odc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36576oda.AEQbTJ((C35249nrk) obj);
                    }
                });
            }
        }
        C35249nrk c35249nrk = c36576oda.EZpvd.get(uri);
        c36576oda.EZpvd.put(uri, new C35249nrk(c35254nrp.OLrzqt().getTargetId(), c35254nrp.OLrzqt().getSeq(), (!Intrinsics.EZpvd(c36576oda.djBIcL(), uri) || c35249nrk == null) ? 5 : c35249nrk.OLrzqt(), (!Intrinsics.EZpvd(c36576oda.djBIcL(), uri) || c35249nrk == null) ? 0.0f : c35249nrk.EZpvd()));
        C36501ocE.OLrzqt().EZpvd(context, uri, c35254nrp, c36576oda.new Application());
    }

    public static final C35249nrk AEQbTJ(C35249nrk c35249nrk) {
        Intrinsics.checkNotNullParameter(c35249nrk, "");
        int iOLrzqt = c35249nrk.OLrzqt();
        return C35249nrk.copy$default(c35249nrk, null, 0L, (iOLrzqt == 6 || iOLrzqt == 7) ? c35249nrk.OLrzqt() : 5, 0.0f, 3, null);
    }

    /* JADX INFO: renamed from: o.oda$Application */
    public static final class Application implements InterfaceC36500ocD {
        public Application() {
        }

        @Override // o.InterfaceC36500ocD
        public void EZpvd(android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.values((C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk values(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 0, 0.0f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void AEQbTJ(android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.isConnected((C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk isConnected(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 1, 0.0f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void KWHzl(android.net.Uri uri, final float f, long j) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.EZpvd(f, (C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk EZpvd(float f, C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 2, f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void KWHzl(android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.AhwBna((C35249nrk) obj);
                }
            });
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.djBIcL((C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk AhwBna(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 3, 1.0f, 3, null);
        }

        public static final C35249nrk djBIcL(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 5, 0.0f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void AEQbTJ(android.net.Uri uri, final float f, long j) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.OLrzqt(f, (C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk OLrzqt(float f, C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 4, f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void EZpvd(android.net.Uri uri, ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.AYXKKw((C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk AYXKKw(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 6, 0.0f, 3, null);
        }

        @Override // o.InterfaceC36500ocD
        public void AEQbTJ(android.net.Uri uri, ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(uri, "");
            C36576oda.this.KWHzl(uri, new Function1() { // from class: o.odi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36576oda.Application.gEmmrt((C35249nrk) obj);
                }
            });
        }

        public static final C35249nrk gEmmrt(C35249nrk c35249nrk) {
            Intrinsics.checkNotNullParameter(c35249nrk, "");
            return C35249nrk.copy$default(c35249nrk, null, 0L, 7, 0.0f, 3, null);
        }
    }

    public final boolean valueOf() {
        return this.AEQbTJ.post(new java.lang.Runnable() { // from class: o.odg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36576oda.copydefault();
            }
        });
    }

    public static final void copydefault() {
        C36501ocE.OLrzqt().gEmmrt();
    }

    public final boolean AhwBna() {
        return this.AEQbTJ.post(new java.lang.Runnable() { // from class: o.ode
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36576oda.EZpvd();
            }
        });
    }

    public static final void EZpvd() {
        C36501ocE.OLrzqt().AkhnZx();
    }

    public final boolean OLrzqt() {
        return this.AEQbTJ.post(new java.lang.Runnable() { // from class: o.odd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36576oda.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C36576oda c36576oda) {
        C36501ocE.OLrzqt().AkhnZx();
        c36576oda.EZpvd.clear();
    }

    public final boolean AYXKKw() {
        return C36501ocE.OLrzqt().valueOf();
    }

    public final android.net.Uri djBIcL() {
        return C36501ocE.OLrzqt().AEQbTJ();
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C36501ocE.OLrzqt().OLrzqt(context);
    }

    public final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C36501ocE.OLrzqt().AEQbTJ(context);
    }
}
