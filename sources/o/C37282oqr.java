package o;

import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43315rmv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37282oqr extends C43319rmz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37282oqr(@NotNull C59534zip c59534zip) {
        super(c59534zip, new InterfaceC43315rmv.Application() { // from class: o.oqr.1
            @Override // o.InterfaceC43315rmv.Application
            public java.lang.Object KWHzl(int i, int i2) {
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[ORIG_RETURN, RETURN] */
            @Override // o.InterfaceC43315rmv.Application
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
                if ((obj instanceof C37248oqJ) && (obj2 instanceof C37248oqJ)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C37248oqJ) obj).OLrzqt().getContactsId(), (java.lang.Object) ((C37248oqJ) obj2).OLrzqt().getContactsId());
                }
                if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
                    if (((ListButton) obj).getDescription() == ((ListButton) obj2).getDescription()) {
                        return true;
                    }
                } else {
                    if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
                        return Intrinsics.EZpvd(((AbstractC37253oqO) obj).KWHzl(), ((AbstractC37253oqO) obj2).KWHzl());
                    }
                    if (!(obj instanceof C37249oqK) || !(obj2 instanceof C37249oqK)) {
                        if ((obj instanceof C37246oqH) && (obj2 instanceof C37246oqH)) {
                            return Intrinsics.EZpvd((java.lang.Object) ((C37246oqH) obj).copydefault(), (java.lang.Object) ((C37246oqH) obj2).copydefault());
                        }
                        if ((!(obj instanceof C37251oqM) || !(obj2 instanceof C37251oqM)) && (!(obj instanceof C37243oqE) || !(obj2 instanceof C37243oqE) || ((C37243oqE) obj).AEQbTJ() != ((C37243oqE) obj2).AEQbTJ())) {
                            return false;
                        }
                    }
                    return true;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[ORIG_RETURN, RETURN] */
            @Override // o.InterfaceC43315rmv.Application
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
                if ((obj instanceof C37248oqJ) && (obj2 instanceof C37248oqJ)) {
                    C37248oqJ c37248oqJ = (C37248oqJ) obj;
                    C37248oqJ c37248oqJ2 = (C37248oqJ) obj2;
                    if (!Intrinsics.EZpvd((java.lang.Object) c37248oqJ.OLrzqt().getContactsId(), (java.lang.Object) c37248oqJ2.OLrzqt().getContactsId()) || !Intrinsics.EZpvd((java.lang.Object) c37248oqJ.OLrzqt().getAvatar(), (java.lang.Object) c37248oqJ2.OLrzqt().getAvatar()) || !Intrinsics.EZpvd((java.lang.Object) c37248oqJ.OLrzqt().getNickName(), (java.lang.Object) c37248oqJ2.OLrzqt().getNickName()) || !Intrinsics.EZpvd((java.lang.Object) c37248oqJ.OLrzqt().getEnNickName(), (java.lang.Object) c37248oqJ2.OLrzqt().getEnNickName()) || !Intrinsics.EZpvd((java.lang.Object) c37248oqJ.OLrzqt().getRemarkName(), (java.lang.Object) c37248oqJ2.OLrzqt().getRemarkName()) || !Intrinsics.EZpvd((java.lang.Object) c37248oqJ.KWHzl(), (java.lang.Object) c37248oqJ2.KWHzl())) {
                    }
                } else if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
                    ListButton listButton = (ListButton) obj;
                    ListButton listButton2 = (ListButton) obj2;
                    if (listButton.getDescription() == listButton2.getDescription() && listButton.getIconRes() == listButton2.getIconRes()) {
                        return true;
                    }
                } else {
                    if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
                        return Intrinsics.EZpvd(((AbstractC37253oqO) obj).KWHzl(), ((AbstractC37253oqO) obj2).KWHzl());
                    }
                    if (!(obj instanceof C37249oqK) || !(obj2 instanceof C37249oqK)) {
                        if ((obj instanceof C37246oqH) && (obj2 instanceof C37246oqH)) {
                            C37246oqH c37246oqH = (C37246oqH) obj;
                            C37246oqH c37246oqH2 = (C37246oqH) obj2;
                            if (!Intrinsics.EZpvd((java.lang.Object) c37246oqH.copydefault(), (java.lang.Object) c37246oqH2.copydefault()) || !Intrinsics.EZpvd((java.lang.Object) c37246oqH.EZpvd(), (java.lang.Object) c37246oqH2.EZpvd()) || !Intrinsics.EZpvd((java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt())).getRawNumber(), (java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH2.OLrzqt())).getRawNumber()) || c37246oqH.OLrzqt().size() != c37246oqH2.OLrzqt().size()) {
                                return false;
                            }
                        } else if (!(obj instanceof C37251oqM) || !(obj2 instanceof C37251oqM)) {
                            if ((obj instanceof C37243oqE) && (obj2 instanceof C37243oqE)) {
                                return Intrinsics.EZpvd(obj, obj2);
                            }
                            return false;
                        }
                    }
                    return true;
                }
            }
        });
        Intrinsics.checkNotNullParameter(c59534zip, "");
    }
}
