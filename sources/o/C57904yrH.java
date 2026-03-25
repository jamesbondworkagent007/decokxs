package o;

import io.reactivex.subjects.PublishSubject;

/* JADX INFO: renamed from: o.yrH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C57904yrH {
    public static final java.lang.Object copydefault = new java.lang.Object();
    public FragmentC57910yrN AEQbTJ;

    public boolean KWHzl() {
        return true;
    }

    public C57904yrH(@androidx.annotation.NonNull android.app.Activity activity) {
        this.AEQbTJ = KWHzl(activity);
    }

    public final FragmentC57910yrN KWHzl(android.app.Activity activity) {
        FragmentC57910yrN fragmentC57910yrNCopydefault = copydefault(activity);
        if (fragmentC57910yrNCopydefault != null) {
            return fragmentC57910yrNCopydefault;
        }
        FragmentC57910yrN fragmentC57910yrN = new FragmentC57910yrN();
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(fragmentC57910yrN, "RxPermissions").commit();
        fragmentManager.executePendingTransactions();
        return fragmentC57910yrN;
    }

    public final FragmentC57910yrN copydefault(android.app.Activity activity) {
        return (FragmentC57910yrN) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    public <T> InterfaceC58252yxl<T, java.lang.Boolean> EZpvd(final java.lang.String... strArr) {
        return new InterfaceC58252yxl<T, java.lang.Boolean>() { // from class: o.yrH.5
            @Override // o.InterfaceC58252yxl
            public InterfaceC58255yxo<java.lang.Boolean> AEQbTJ(AbstractC58247yxg<T> abstractC58247yxg) {
                return C57904yrH.this.OLrzqt(abstractC58247yxg, strArr).buffer(strArr.length).flatMap(new InterfaceC58229yxO<java.util.List<C57906yrJ>, InterfaceC58255yxo<java.lang.Boolean>>() { // from class: o.yrH.5.4
                    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // o.InterfaceC58229yxO
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public InterfaceC58255yxo<java.lang.Boolean> apply(java.util.List<C57906yrJ> list) throws java.lang.Exception {
                        if (list.isEmpty()) {
                            return AbstractC58247yxg.empty();
                        }
                        java.util.Iterator<C57906yrJ> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().OLrzqt) {
                                return AbstractC58247yxg.just(java.lang.Boolean.FALSE);
                            }
                        }
                        return AbstractC58247yxg.just(java.lang.Boolean.TRUE);
                    }
                });
            }
        };
    }

    public AbstractC58247yxg<java.lang.Boolean> KWHzl(java.lang.String... strArr) {
        return AbstractC58247yxg.just(copydefault).compose(EZpvd(strArr));
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: o.yxg<R>, o.yxg<o.yrJ> */
    public final AbstractC58247yxg<C57906yrJ> OLrzqt(AbstractC58247yxg<?> abstractC58247yxg, final java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return KWHzl(abstractC58247yxg, copydefault(strArr)).flatMap(new InterfaceC58229yxO<java.lang.Object, AbstractC58247yxg<C57906yrJ>>() { // from class: o.yrH.1
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.InterfaceC58229yxO
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public AbstractC58247yxg<C57906yrJ> apply(java.lang.Object obj) throws java.lang.Exception {
                return C57904yrH.this.AEQbTJ(strArr);
            }
        });
    }

    public final AbstractC58247yxg<?> copydefault(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!this.AEQbTJ.EZpvd(str)) {
                return AbstractC58247yxg.empty();
            }
        }
        return AbstractC58247yxg.just(copydefault);
    }

    public final AbstractC58247yxg<?> KWHzl(AbstractC58247yxg<?> abstractC58247yxg, AbstractC58247yxg<?> abstractC58247yxg2) {
        if (abstractC58247yxg == null) {
            return AbstractC58247yxg.just(copydefault);
        }
        return AbstractC58247yxg.merge(abstractC58247yxg, abstractC58247yxg2);
    }

    public final AbstractC58247yxg<C57906yrJ> AEQbTJ(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            this.AEQbTJ.AEQbTJ("Requesting permission " + str);
            if (KWHzl(str)) {
                arrayList.add(AbstractC58247yxg.just(new C57906yrJ(str, true, false)));
            } else if (EZpvd(str)) {
                arrayList.add(AbstractC58247yxg.just(new C57906yrJ(str, false, false)));
            } else {
                PublishSubject<C57906yrJ> publishSubjectOLrzqt = this.AEQbTJ.OLrzqt(str);
                if (publishSubjectOLrzqt == null) {
                    arrayList2.add(str);
                    publishSubjectOLrzqt = PublishSubject.OLrzqt();
                    this.AEQbTJ.KWHzl(str, publishSubjectOLrzqt);
                }
                arrayList.add(publishSubjectOLrzqt);
            }
        }
        if (!arrayList2.isEmpty()) {
            OLrzqt((java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]));
        }
        return AbstractC58247yxg.concat(AbstractC58247yxg.fromIterable(arrayList));
    }

    public void OLrzqt(java.lang.String[] strArr) {
        this.AEQbTJ.AEQbTJ("requestPermissionsFromFragment " + android.text.TextUtils.join(", ", strArr));
        this.AEQbTJ.EZpvd(strArr);
    }

    public boolean KWHzl(java.lang.String str) {
        return !KWHzl() || this.AEQbTJ.KWHzl(str);
    }

    public boolean EZpvd(java.lang.String str) {
        return KWHzl() && this.AEQbTJ.copydefault(str);
    }
}
