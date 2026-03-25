package o;

import o.C44103sDl;

/* JADX INFO: renamed from: o.sDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC44109sDr implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() throws java.lang.Exception {
        C44103sDl.ActionBar actionBar = C44103sDl.Companion;
        java.lang.String name = actionBar.getClass().getName();
        java.lang.String name2 = RunnableC44109sDr.class.getName();
        C6768aVc c6768aVc = C6768aVc.copydefault;
        pUU.copydefault("DetectionDialogManager", "DetectionReport throwException " + name + " \n " + name2 + " \n" + c6768aVc.getClass().getName());
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(RunnableC44109sDr.class.getName());
        arrayList.add(c6768aVc.getClass().getName());
        arrayList.add(actionBar.getClass().getName());
        throw c6768aVc.OLrzqt(arrayList);
    }
}
