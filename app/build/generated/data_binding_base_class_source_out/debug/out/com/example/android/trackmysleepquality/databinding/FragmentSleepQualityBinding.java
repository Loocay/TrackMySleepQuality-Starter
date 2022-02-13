// Generated by data binding compiler. Do not edit!
package com.example.android.trackmysleepquality.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSleepQualityBinding extends ViewDataBinding {
  @NonNull
  public final ImageView qualityFiveImage;

  @NonNull
  public final ImageView qualityFourImage;

  @NonNull
  public final ImageView qualityOneImage;

  @NonNull
  public final ImageView qualityThreeImage;

  @NonNull
  public final ImageView qualityTwoImage;

  @NonNull
  public final ImageView qualityZeroImage;

  @NonNull
  public final TextView titleText;

  @Bindable
  protected SleepQualityViewModel mSleepQualityViewModel;

  protected FragmentSleepQualityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView qualityFiveImage, ImageView qualityFourImage, ImageView qualityOneImage,
      ImageView qualityThreeImage, ImageView qualityTwoImage, ImageView qualityZeroImage,
      TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.qualityFiveImage = qualityFiveImage;
    this.qualityFourImage = qualityFourImage;
    this.qualityOneImage = qualityOneImage;
    this.qualityThreeImage = qualityThreeImage;
    this.qualityTwoImage = qualityTwoImage;
    this.qualityZeroImage = qualityZeroImage;
    this.titleText = titleText;
  }

  public abstract void setSleepQualityViewModel(
      @Nullable SleepQualityViewModel sleepQualityViewModel);

  @Nullable
  public SleepQualityViewModel getSleepQualityViewModel() {
    return mSleepQualityViewModel;
  }

  @NonNull
  public static FragmentSleepQualityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_quality, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepQualityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepQualityBinding>inflateInternal(inflater, R.layout.fragment_sleep_quality, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSleepQualityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_quality, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepQualityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepQualityBinding>inflateInternal(inflater, R.layout.fragment_sleep_quality, null, false, component);
  }

  public static FragmentSleepQualityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSleepQualityBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSleepQualityBinding)bind(component, view, R.layout.fragment_sleep_quality);
  }
}
