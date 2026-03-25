package o;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AssistContent;
import o.ComponentCallbacks2;
import o.IntentSender;
import o.Resources;
import o.Theme;
import o.TypedArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Cursor implements PackageManager {
    public final InterfaceC56387yDm AEQbTJ;
    public final java.lang.ThreadLocal<ComponentCallbacks2.Application> AhwBna;
    public final ActionBar EZpvd;
    public final int KWHzl;
    public final LinkedHashMap<java.lang.String, java.util.Set<AssistContent.TaskDescription>> OLrzqt;
    public final SupportSQLiteOpenHelper copydefault;
    public final java.lang.Long valueOf;

    public Cursor(SupportSQLiteOpenHelper supportSQLiteOpenHelper, final SupportSQLiteDatabase supportSQLiteDatabase, int i, java.lang.Long l) {
        this.copydefault = supportSQLiteOpenHelper;
        this.KWHzl = i;
        this.valueOf = l;
        if (!((supportSQLiteOpenHelper != null) ^ (supportSQLiteDatabase != null))) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.AhwBna = new java.lang.ThreadLocal<>();
        this.AEQbTJ = C56392yDr.copydefault(new Function0<SupportSQLiteDatabase>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$database$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SupportSQLiteDatabase invoke() {
                SupportSQLiteDatabase writableDatabase;
                SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = this.this$0.copydefault;
                if (supportSQLiteOpenHelper2 != null && (writableDatabase = supportSQLiteOpenHelper2.getWritableDatabase()) != null) {
                    return writableDatabase;
                }
                SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                Intrinsics.copydefault(supportSQLiteDatabase2);
                return supportSQLiteDatabase2;
            }
        });
        this.EZpvd = new ActionBar(i);
        this.OLrzqt = new LinkedHashMap<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:androidx.sqlite.db.SupportSQLiteOpenHelper:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.sqlite.db.SupportSQLiteOpenHelper) : (r2v0 androidx.sqlite.db.SupportSQLiteOpenHelper))
  (wrap:androidx.sqlite.db.SupportSQLiteDatabase:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null androidx.sqlite.db.SupportSQLiteDatabase) : (r3v0 androidx.sqlite.db.SupportSQLiteDatabase))
  (r4v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.sqlite.db.SupportSQLiteDatabase, int, java.lang.Long):void (m)] (LINE:29) call: o.Cursor.<init>(androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.sqlite.db.SupportSQLiteDatabase, int, java.lang.Long):void type: THIS */
    public /* synthetic */ Cursor(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i, java.lang.Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : supportSQLiteOpenHelper, (i2 & 2) != 0 ? null : supportSQLiteDatabase, i, (i2 & 8) != 0 ? null : l);
    }

    @Override // o.PackageManager
    public /* synthetic */ IntentSender OLrzqt(java.lang.Integer num, java.lang.String str, Function1 function1, int i, Function1 function12) {
        return IntentSender.Activity.EZpvd(EZpvd(num, str, function1, i, function12));
    }

    public final SupportSQLiteDatabase EZpvd() {
        return (SupportSQLiteDatabase) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r13v0 o.ColorStateList)
  (r14v0 android.content.Context)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:androidx.sqlite.db.SupportSQLiteOpenHelper$Factory:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:59) call: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory.<init>():void type: CONSTRUCTOR) : (r16v0 androidx.sqlite.db.SupportSQLiteOpenHelper$Factory))
  (wrap:androidx.sqlite.db.SupportSQLiteOpenHelper$Callback:?: TERNARY null = ((wrap:int:0x0017: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: CONSTRUCTOR (r13v0 o.ColorStateList), (wrap:o.SharedPreferences[]:0x001e: NEW_ARRAY (0 int) A[WRAPPED] type: o.SharedPreferences[]) A[MD:(o.ColorStateList<o.IntentSender$Activity<kotlin.Unit>>, o.SharedPreferences[]):void VARARG (m), VARARG_CALL, WRAPPED] (LINE:60) call: o.Cursor.StateListAnimator.<init>(o.ColorStateList, o.SharedPreferences[]):void type: CONSTRUCTOR) : (r17v0 androidx.sqlite.db.SupportSQLiteOpenHelper$Callback))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r18v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
 A[MD:(o.ColorStateList<o.IntentSender$Activity<kotlin.Unit>>, android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.sqlite.db.SupportSQLiteOpenHelper$Callback, int, boolean, java.lang.Long):void (m)] (LINE:55) call: o.Cursor.<init>(o.ColorStateList, android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.sqlite.db.SupportSQLiteOpenHelper$Callback, int, boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ Cursor(ColorStateList colorStateList, android.content.Context context, java.lang.String str, SupportSQLiteOpenHelper.Factory factory, SupportSQLiteOpenHelper.Callback callback, int i, boolean z, java.lang.Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorStateList, context, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? new FrameworkSQLiteOpenHelperFactory() : factory, (i2 & 16) != 0 ? new StateListAnimator(colorStateList, new SharedPreferences[0]) : callback, (i2 & 32) != 0 ? 20 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cursor(@NotNull ColorStateList<IntentSender.Activity<Unit>> colorStateList, @NotNull android.content.Context context, java.lang.String str, @NotNull SupportSQLiteOpenHelper.Factory factory, @NotNull SupportSQLiteOpenHelper.Callback callback, int i, boolean z, java.lang.Long l) {
        this(factory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(context).callback(callback).name(str).noBackupDirectory(z).build()), null, i, l);
        Intrinsics.checkNotNullParameter(colorStateList, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(factory, "");
        Intrinsics.checkNotNullParameter(callback, "");
    }

    public static final class ActionBar extends android.util.LruCache<java.lang.Integer, TypedArray> {
        public ActionBar(int i) {
            super(i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, java.lang.Integer num, TypedArray typedArray, TypedArray typedArray2) {
            copydefault(z, num.intValue(), typedArray, typedArray2);
        }

        public void copydefault(boolean z, int i, @NotNull TypedArray typedArray, TypedArray typedArray2) {
            Intrinsics.checkNotNullParameter(typedArray, "");
            if (z) {
                typedArray.OLrzqt();
            }
        }
    }

    @Override // o.PackageManager
    public void AEQbTJ(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        synchronized (this.OLrzqt) {
            for (java.lang.String str : strArr) {
                LinkedHashMap<java.lang.String, java.util.Set<AssistContent.TaskDescription>> linkedHashMap = this.OLrzqt;
                java.util.Set<AssistContent.TaskDescription> linkedHashSet = linkedHashMap.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    linkedHashMap.put(str, linkedHashSet);
                }
                linkedHashSet.add(taskDescription);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.PackageManager
    public void OLrzqt(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        synchronized (this.OLrzqt) {
            for (java.lang.String str : strArr) {
                java.util.Set<AssistContent.TaskDescription> set = this.OLrzqt.get(str);
                if (set != null) {
                    set.remove(taskDescription);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.PackageManager
    public void EZpvd(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.OLrzqt) {
            for (java.lang.String str : strArr) {
                java.util.Set<AssistContent.TaskDescription> set = this.OLrzqt.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((AssistContent.TaskDescription) it.next()).AEQbTJ();
        }
    }

    @Override // o.PackageManager
    public IntentSender<ComponentCallbacks2.Application> AEQbTJ() {
        ComponentCallbacks2.Application application = this.AhwBna.get();
        TaskDescription taskDescription = new TaskDescription(application);
        this.AhwBna.set(taskDescription);
        if (application == null) {
            EZpvd().beginTransactionNonExclusive();
        }
        return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(taskDescription));
    }

    @Override // o.PackageManager
    public ComponentCallbacks2.Application OLrzqt() {
        return this.AhwBna.get();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class TaskDescription extends ComponentCallbacks2.Application {
        public final ComponentCallbacks2.Application djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ComponentCallbacks2.Application
        public ComponentCallbacks2.Application EZpvd() {
            return this.djBIcL;
        }

        public TaskDescription(ComponentCallbacks2.Application application) {
            this.djBIcL = application;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.IntentSender.Activity.EZpvd(java.lang.Object):o.IntentSender$Activity */
        @Override // o.ComponentCallbacks2.Application
        public IntentSender<Unit> OLrzqt(boolean z) {
            if (EZpvd() == null) {
                if (z) {
                    Cursor.this.EZpvd().setTransactionSuccessful();
                    Cursor.this.EZpvd().endTransaction();
                } else {
                    Cursor.this.EZpvd().endTransaction();
                }
            }
            Cursor.this.AhwBna.set(EZpvd());
            return IntentSender.Activity.EZpvd(IntentSender.OLrzqt.AEQbTJ());
        }
    }

    public final <T> java.lang.Object OLrzqt(java.lang.Integer num, Function0<? extends TypedArray> function0, Function1<? super Configuration, Unit> function1, Function1<? super TypedArray, ? extends T> function12) {
        TypedArray typedArrayRemove = num != null ? this.EZpvd.remove(num) : null;
        if (typedArrayRemove == null) {
            typedArrayRemove = function0.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(typedArrayRemove);
            } catch (java.lang.Throwable th) {
                if (num != null) {
                    TypedArray typedArrayPut = this.EZpvd.put(num, typedArrayRemove);
                    if (typedArrayPut != null) {
                        typedArrayPut.OLrzqt();
                    }
                } else {
                    typedArrayRemove.OLrzqt();
                }
                throw th;
            }
        }
        java.lang.Object objCopydefault = IntentSender.Activity.copydefault(function12.invoke(typedArrayRemove));
        if (num != null) {
            TypedArray typedArrayPut2 = this.EZpvd.put(num, typedArrayRemove);
            if (typedArrayPut2 != null) {
                typedArrayPut2.OLrzqt();
            }
        } else {
            typedArrayRemove.OLrzqt();
        }
        return objCopydefault;
    }

    @Override // o.PackageManager
    public IntentSender<java.lang.Long> AEQbTJ(java.lang.Integer num, @NotNull final java.lang.String str, int i, Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        return IntentSender.Activity.EZpvd(OLrzqt(num, new Function0<TypedArray>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$execute$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final TypedArray invoke() {
                return new Resources(this.this$0.EZpvd().compileStatement(str));
            }
        }, function1, new Function1<TypedArray, java.lang.Long>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$execute$2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull TypedArray typedArray) {
                Intrinsics.checkNotNullParameter(typedArray, "");
                return Long.valueOf(typedArray.KWHzl());
            }
        }));
    }

    public <R> java.lang.Object EZpvd(java.lang.Integer num, @NotNull final java.lang.String str, @NotNull final Function1<? super AssetManager, ? extends IntentSender<R>> function1, final int i, Function1<? super Configuration, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return OLrzqt(num, new Function0<TypedArray>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$executeQuery$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final TypedArray invoke() {
                return new Theme(str, this.EZpvd(), i, this.valueOf);
            }
        }, function12, new Function1<TypedArray, R>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$executeQuery$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.AssetManager, ? extends o.IntentSender<R>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final R invoke(@NotNull TypedArray typedArray) {
                Intrinsics.checkNotNullParameter(typedArray, "");
                return (R) typedArray.AEQbTJ(function1);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        Unit unit;
        this.EZpvd.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.copydefault;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            EZpvd().close();
        }
    }

    public static class StateListAnimator extends SupportSQLiteOpenHelper.Callback {
        public final SharedPreferences[] AEQbTJ;
        public final ColorStateList<IntentSender.Activity<Unit>> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ColorStateList<IntentSender.Activity<Unit>> colorStateList, @NotNull SharedPreferences... sharedPreferencesArr) {
            super((int) colorStateList.getVersion());
            Intrinsics.checkNotNullParameter(colorStateList, "");
            Intrinsics.checkNotNullParameter(sharedPreferencesArr, "");
            if (colorStateList.getVersion() <= 2147483647L) {
                this.KWHzl = colorStateList;
                this.AEQbTJ = sharedPreferencesArr;
            } else {
                throw new java.lang.IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + colorStateList.getVersion() + '.').toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            this.KWHzl.create(new Cursor(null, supportSQLiteDatabase, 1, null, 8, null));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            SharedPreferences[] sharedPreferencesArr = this.AEQbTJ;
            this.KWHzl.migrate(new Cursor(null, supportSQLiteDatabase, 1, null, 8, null), i, i2, (SharedPreferences[]) java.util.Arrays.copyOf(sharedPreferencesArr, sharedPreferencesArr.length));
        }
    }
}
