package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC5105Ex;
import o.AbstractC5109Fb;
import o.FA;

/* JADX INFO: renamed from: o.Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5118Fk {
    /* JADX DEBUG: Class process forced to load method for inline: o.Fl.toQualifiedNames$default(o.Et, o.Ft, int, java.lang.Object):java.util.Set */
    public static final java.util.List<AbstractC5109Fb> copydefault(XmlStreamReader xmlStreamReader, C5098Eq c5098Eq) {
        if (C5119Fl.AEQbTJ(c5098Eq) && (xmlStreamReader.OLrzqt() instanceof FA.ActionBar)) {
            java.util.List<C5101Et> listOLrzqt = c5098Eq.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listOLrzqt) {
                java.util.Set<InterfaceC5096Eo> setAEQbTJ = ((C5101Et) obj).AEQbTJ();
                if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
                    java.util.Iterator<T> it = setAEQbTJ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((InterfaceC5096Eo) it.next()) instanceof C5112Fe) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            java.util.ArrayList<C5101Et> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                C5101Et c5101Et = (C5101Et) obj2;
                FA faOLrzqt = xmlStreamReader.OLrzqt();
                Intrinsics.copydefault(faOLrzqt, "");
                FA.ActionBar actionBar = (FA.ActionBar) faOLrzqt;
                FA faPeek$default = XmlStreamReader.StateListAnimator.peek$default(xmlStreamReader, 0, 1, null);
                if (faPeek$default == null) {
                    throw new DeserializationException("Unexpected end of tokens");
                }
                if (KWHzl(c5101Et, actionBar, faPeek$default) != null) {
                    arrayList2.add(obj2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (C5101Et c5101Et2 : arrayList2) {
                arrayList3.add(new AbstractC5109Fb.ActionBar(c5101Et2.copydefault(), C5119Fl.toQualifiedNames$default(c5101Et2, null, 1, null)));
            }
            return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList3);
        }
        return new java.util.ArrayList();
    }

    public static final AbstractC5109Fb KWHzl(C5101Et c5101Et, FA.ActionBar actionBar, FA fa) {
        AbstractC5109Fb abstractC5109FbCopydefault = copydefault(c5101Et);
        if (abstractC5109FbCopydefault instanceof AbstractC5109Fb.TaskDescription) {
            if (!(fa instanceof FA.Dialog) && !(fa instanceof FA.ActionBar)) {
                if ((fa instanceof FA.StateListAnimator) && Intrinsics.EZpvd(actionBar.OLrzqt(), ((FA.StateListAnimator) fa).AEQbTJ())) {
                    return (AbstractC5109Fb.TaskDescription) abstractC5109FbCopydefault;
                }
            }
            return (AbstractC5109Fb.TaskDescription) abstractC5109FbCopydefault;
        }
        if (abstractC5109FbCopydefault instanceof AbstractC5109Fb.ActionBar) {
            AbstractC5109Fb.ActionBar actionBar2 = (AbstractC5109Fb.ActionBar) abstractC5109FbCopydefault;
            java.util.Set<FA.Application> setKWHzl = actionBar2.KWHzl();
            if (!(setKWHzl instanceof java.util.Collection) || !setKWHzl.isEmpty()) {
                java.util.Iterator<T> it = setKWHzl.iterator();
                while (it.hasNext()) {
                    if (actionBar.EZpvd().get((FA.Application) it.next()) != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0))) {
                        return actionBar2;
                    }
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final boolean copydefault(C5098Eq c5098Eq, C5101Et c5101Et, FA.ActionBar actionBar) {
        java.lang.Object next;
        if (Intrinsics.EZpvd(c5101Et.KWHzl(), AbstractC5105Ex.Fragment.KWHzl)) {
            java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
            if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
                java.util.Iterator<T> it = setAEQbTJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                        java.util.Iterator<T> it2 = c5101Et.AEQbTJ().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (((InterfaceC5096Eo) next).getClass() == C5115Fh.class) {
                                break;
                            }
                        }
                        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
                        C5115Fh c5115FhOLrzqt = (C5115Fh) (interfaceC5096Eo instanceof C5115Fh ? interfaceC5096Eo : null);
                        if (c5115FhOLrzqt == null) {
                            c5115FhOLrzqt = C5115Fh.OLrzqt.OLrzqt();
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) c5115FhOLrzqt.copydefault(), (java.lang.Object) actionBar.OLrzqt().AEQbTJ())) {
                            return true;
                        }
                    }
                }
            }
        }
        return C5119Fl.EZpvd(c5101Et, actionBar.OLrzqt().OLrzqt());
    }

    public static final AbstractC5109Fb copydefault(C5101Et c5101Et) {
        java.lang.Object next;
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == C5112Fe.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5112Fe)) {
            interfaceC5096Eo = null;
        }
        if (((C5112Fe) interfaceC5096Eo) == null) {
            return new AbstractC5109Fb.TaskDescription(c5101Et.copydefault());
        }
        return new AbstractC5109Fb.ActionBar(c5101Et.copydefault(), C5119Fl.toQualifiedNames$default(c5101Et, null, 1, null));
    }
}
