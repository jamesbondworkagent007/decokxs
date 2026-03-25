package o;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19631gJn extends AbstractC33073mpa {
    public final MutableLiveData<AbstractC12782ctV> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<AbstractC12782ctV> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<AbstractC12782ctV> AEQbTJ = new MutableLiveData<>();
    public final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> copydefault() {
        return this.AEQbTJ;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        if (xYS.copydefault.copydefault(str2).getType() == 1) {
            AEQbTJ(str, str2, z, z2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19631gJn.AEQbTJ((AbstractC12782ctV) obj);
                }
            });
        } else {
            call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, str2, z, z2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19631gJn.AEQbTJ(this.AEQbTJ, (AbstractC12782ctV) obj);
                }
            }));
        }
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            c19631gJn.OLrzqt.setValue(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, str2, z, z2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19631gJn.AEQbTJ(function1, this, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(Function1 function1, C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, j, str2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19631gJn.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit EZpvd(C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            c19631gJn.KWHzl.setValue(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, j, str2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19631gJn.KWHzl(function1, this, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit KWHzl(Function1 function1, C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void importTrackingWallet$default(C19631gJn c19631gJn, long j, java.lang.String str, boolean z, androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c19631gJn.KWHzl(j, str, z, fragmentManager);
    }

    public final void KWHzl(long j, @NotNull java.lang.String str, boolean z, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(str, "");
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(j, str, z, fragmentManager, new Function1() { // from class: o.gJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19631gJn.AhwBna(this.KWHzl, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit AhwBna(C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            c19631gJn.AEQbTJ.setValue(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str5, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        dZP dzp = dZP.OLrzqt;
        java.lang.String strOLrzqt = dzp.OLrzqt();
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, str2, dzp.EZpvd(), dzp.djBIcL(), strOLrzqt, dzp.AhwBna(), str3, str4, i, fragmentManager, null, null, function1, str5, i2));
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        call().AEQbTJ(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, str2, z, z2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.gJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19631gJn.gEmmrt(function1, this, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit gEmmrt(Function1 function1, C19631gJn c19631gJn, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            c19631gJn.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        this.copydefault.post(new java.lang.Runnable() { // from class: o.gJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19631gJn.EZpvd(str);
            }
        });
    }

    public static final void EZpvd(java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }
}
