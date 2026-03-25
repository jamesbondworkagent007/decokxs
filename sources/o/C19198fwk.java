package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19198fwk extends DiffUtil.ItemCallback<java.lang.Object> {
    /* JADX WARN: Removed duplicated region for block: B:80:0x0159 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C18982fsg) && (obj2 instanceof C18982fsg)) {
            C18982fsg c18982fsg = (C18982fsg) obj;
            C18982fsg c18982fsg2 = (C18982fsg) obj2;
            if (c18982fsg.copydefault().OLrzqt() != c18982fsg2.copydefault().OLrzqt() || !Intrinsics.EZpvd((java.lang.Object) c18982fsg.copydefault().fetchVPNInfo(), (java.lang.Object) c18982fsg2.copydefault().fetchVPNInfo())) {
            }
        } else if ((obj instanceof C18953fsD) && (obj2 instanceof C18953fsD)) {
            if (((C18953fsD) obj).AEQbTJ() == ((C18953fsD) obj2).AEQbTJ()) {
                return true;
            }
        } else {
            if ((!(obj instanceof C18994fss) || !(obj2 instanceof C18994fss)) && ((!(obj instanceof C18991fsp) || !(obj2 instanceof C18991fsp)) && (!(obj instanceof C18951fsB) || !(obj2 instanceof C18951fsB)))) {
                if ((obj instanceof C19001fsz) && (obj2 instanceof C19001fsz)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C19001fsz) obj).EZpvd(), (java.lang.Object) ((C19001fsz) obj2).EZpvd());
                }
                if ((obj instanceof C18996fsu) && (obj2 instanceof C18996fsu)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C18996fsu) obj).AEQbTJ(), (java.lang.Object) ((C18996fsu) obj2).AEQbTJ());
                }
                if ((obj instanceof C18952fsC) && (obj2 instanceof C18952fsC)) {
                    C18952fsC c18952fsC = (C18952fsC) obj;
                    C18952fsC c18952fsC2 = (C18952fsC) obj2;
                    if (!Intrinsics.EZpvd((java.lang.Object) c18952fsC.AEQbTJ(), (java.lang.Object) c18952fsC2.AEQbTJ()) || !Intrinsics.EZpvd((java.lang.Object) c18952fsC.OLrzqt(), (java.lang.Object) c18952fsC2.OLrzqt())) {
                    }
                } else {
                    if ((obj instanceof C18997fsv) && (obj2 instanceof C18997fsv)) {
                        return Intrinsics.EZpvd((java.lang.Object) ((C18997fsv) obj).KWHzl(), (java.lang.Object) ((C18997fsv) obj2).KWHzl());
                    }
                    if ((obj instanceof C18950fsA) && (obj2 instanceof C18950fsA)) {
                        return Intrinsics.EZpvd((java.lang.Object) ((C18950fsA) obj).KWHzl(), (java.lang.Object) ((C18950fsA) obj2).KWHzl());
                    }
                    if ((obj instanceof C18977fsb) && (obj2 instanceof C18977fsb)) {
                        if (((C18977fsb) obj).KWHzl().KWHzl() == ((C18977fsb) obj2).KWHzl().KWHzl()) {
                        }
                    } else {
                        if ((obj instanceof C18983fsh) && (obj2 instanceof C18983fsh)) {
                            return Intrinsics.EZpvd((java.lang.Object) ((C18983fsh) obj).EZpvd(), (java.lang.Object) ((C18983fsh) obj2).EZpvd());
                        }
                        if (!(obj instanceof C18998fsw) || !(obj2 instanceof C18998fsw) || ((C18998fsw) obj).KWHzl() != ((C18998fsw) obj2).KWHzl()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C18982fsg) && (obj2 instanceof C18982fsg)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18953fsD) && (obj2 instanceof C18953fsD)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18994fss) && (obj2 instanceof C18994fss)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18991fsp) && (obj2 instanceof C18991fsp)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18951fsB) && (obj2 instanceof C18951fsB)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C19001fsz) && (obj2 instanceof C19001fsz)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18996fsu) && (obj2 instanceof C18996fsu)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18952fsC) && (obj2 instanceof C18952fsC)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18997fsv) && (obj2 instanceof C18997fsv)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18950fsA) && (obj2 instanceof C18950fsA)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18977fsb) && (obj2 instanceof C18977fsb)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18983fsh) && (obj2 instanceof C18983fsh)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18998fsw) && (obj2 instanceof C18998fsw)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        return false;
    }
}
