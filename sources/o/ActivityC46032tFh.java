package o;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46043tFs;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC46032tFh extends AbstractActivityC47505trP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public boolean copydefault;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new TaskDescription(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Activity(this, "page", ""));
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new ActionBar(this, "social_history", java.lang.Boolean.FALSE));
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tFg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46032tFh.EZpvd(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.tFh$ActionBar */
    public static final class ActionBar implements Function0<java.lang.Boolean> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ AppCompatActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(AppCompatActivity appCompatActivity, java.lang.String str, java.lang.Object obj) {
            this.copydefault = appCompatActivity;
            this.EZpvd = str;
            this.OLrzqt = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Boolean invoke() {
            java.lang.Object parcelable;
            java.lang.Object objValueOf;
            android.os.Bundle extras = this.copydefault.getIntent().getExtras();
            java.lang.String str = this.EZpvd;
            ?? r2 = this.OLrzqt;
            if (extras == null || !extras.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Boolean.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Integer.valueOf(extras.getInt(str));
                    objValueOf = (java.lang.Boolean) (objValueOf2 instanceof java.lang.Boolean ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Long.valueOf(extras.getLong(str));
                    objValueOf = (java.lang.Boolean) (objValueOf3 instanceof java.lang.Boolean ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Float.valueOf(extras.getFloat(str));
                    objValueOf = (java.lang.Boolean) (objValueOf4 instanceof java.lang.Boolean ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Double.valueOf(extras.getDouble(str));
                    objValueOf = (java.lang.Boolean) (objValueOf5 instanceof java.lang.Boolean ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    objValueOf = java.lang.Boolean.valueOf(extras.getBoolean(str));
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = extras.getString(str);
                    objValueOf = (java.lang.Boolean) (string instanceof java.lang.Boolean ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(str, java.lang.Boolean.class);
                } else {
                    java.lang.Object parcelable2 = extras.getParcelable(str);
                    objValueOf = (java.lang.Boolean) (parcelable2 instanceof java.lang.Boolean ? parcelable2 : null);
                }
                return objValueOf != null ? r2 : objValueOf;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = extras.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                parcelable = (java.lang.Boolean) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = extras.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                parcelable = (java.lang.Boolean) parcelableArrayList2;
            }
            objValueOf = parcelable;
            if (objValueOf != null) {
            }
        }
    }

    /* JADX INFO: renamed from: o.tFh$Activity */
    public static final class Activity implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ AppCompatActivity EZpvd;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(AppCompatActivity appCompatActivity, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = appCompatActivity;
            this.AEQbTJ = str;
            this.copydefault = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle extras = this.EZpvd.getIntent().getExtras();
            java.lang.String str = this.AEQbTJ;
            ?? r2 = this.copydefault;
            if (extras == null || !extras.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(extras.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(extras.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(extras.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(extras.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(extras.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = extras.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = extras.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = extras.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = extras.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    /* JADX INFO: renamed from: o.tFh$TaskDescription */
    public static final class TaskDescription implements Function0<PlanetUniqueName> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ AppCompatActivity EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AppCompatActivity appCompatActivity, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = appCompatActivity;
            this.copydefault = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetUniqueName */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetUniqueName, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetUniqueName invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle extras = this.EZpvd.getIntent().getExtras();
            java.lang.String str = this.copydefault;
            ?? r2 = this.AEQbTJ;
            if (extras == null || !extras.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetUniqueName.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(extras.getInt(str));
                    obj = (PlanetUniqueName) (objValueOf instanceof PlanetUniqueName ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(extras.getLong(str));
                    obj = (PlanetUniqueName) (objValueOf2 instanceof PlanetUniqueName ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(extras.getFloat(str));
                    obj = (PlanetUniqueName) (objValueOf3 instanceof PlanetUniqueName ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(extras.getDouble(str));
                    obj = (PlanetUniqueName) (objValueOf4 instanceof PlanetUniqueName ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(extras.getBoolean(str));
                    obj = (PlanetUniqueName) (objValueOf5 instanceof PlanetUniqueName ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = extras.getString(str);
                    obj = (PlanetUniqueName) (string instanceof PlanetUniqueName ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(str, PlanetUniqueName.class);
                } else {
                    java.lang.Object parcelable2 = extras.getParcelable(str);
                    obj = (PlanetUniqueName) (parcelable2 instanceof PlanetUniqueName ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = extras.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = extras.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    /* JADX INFO: renamed from: o.tFh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tFh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46032tFh.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str)), C56390yDp.OLrzqt("social_history", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("page", str2)));
            return intent;
        }
    }

    private final java.lang.String EZpvd() {
        return ((PlanetUniqueName) this.gEmmrt.getValue()).EZpvd();
    }

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    private final boolean copydefault() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public final java.util.List<kotlin.Pair<java.lang.String, androidx.fragment.app.Fragment>> KWHzl() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List EZpvd(ActivityC46032tFh activityC46032tFh) {
        return yDY.gEmmrt(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.zuBGHE), C46043tFs.StateListAnimator.m8714newInstanceEPykF4U$default(C46043tFs.Companion, activityC46032tFh.EZpvd(), false, activityC46032tFh.OLrzqt(), null, 8, null)), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.gHZMYf), tFJ.Companion.EZpvd(activityC46032tFh.EZpvd(), activityC46032tFh.OLrzqt())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46230tMq c46230tMqCopydefault = C46230tMq.copydefault(getLayoutInflater());
        setContentView(c46230tMqCopydefault.getRoot());
        ViewPager2 viewPager2 = c46230tMqCopydefault.OLrzqt;
        viewPager2.setOffscreenPageLimit(KWHzl().size());
        viewPager2.setAdapter(new Application(getSupportFragmentManager(), getLifecycle()));
        viewPager2.setCurrentItem(copydefault() ? 1 : 0, false);
        new TabLayoutMediator(c46230tMqCopydefault.AEQbTJ.copydefault(), c46230tMqCopydefault.OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC46032tFh.copydefault(this.KWHzl, tab, i);
            }
        }).attach();
        c46230tMqCopydefault.getRoot().post(new java.lang.Runnable() { // from class: o.tFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC46032tFh.OLrzqt(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.tFh$Application */
    public static final class Application extends FragmentStateAdapter {
        public Application(androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ActivityC46032tFh.this.KWHzl().size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return (androidx.fragment.app.Fragment) ((kotlin.Pair) ActivityC46032tFh.this.KWHzl().get(i)).getSecond();
        }
    }

    public static final void copydefault(ActivityC46032tFh activityC46032tFh, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(activityC46032tFh.KWHzl().get(i).getFirst());
    }

    public static final void OLrzqt(ActivityC46032tFh activityC46032tFh) {
        if (activityC46032tFh.copydefault) {
            return;
        }
        activityC46032tFh.copydefault = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC46032tFh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
