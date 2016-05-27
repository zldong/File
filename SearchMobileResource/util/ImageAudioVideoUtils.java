package io.vov.vitamio.demo.util;

import io.vov.vitamio.demo.bean.AudioBean;
import io.vov.vitamio.demo.bean.ImageBean;
import io.vov.vitamio.demo.bean.VideoBean;
import java.util.ArrayList;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video;
import android.util.Log;
public class ImageAudioVideoUtils {
	// ����SD���е���Ƶ
	/**
	 * ����SD���е���Ƶ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<AudioBean> getAudioFileFromExternal(Context context) {
		ArrayList<AudioBean> list = new ArrayList<AudioBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
				null, null, null, null);
		AudioBean audio = null;
		while (query.moveToNext()) {
			String _id = query.getString(query.getColumnIndex(Audio.Media._ID));
			String display_name = query.getString(query
					.getColumnIndex(Audio.Media.DISPLAY_NAME));
			String duration = query.getString(query
					.getColumnIndex(Audio.Media.DURATION));
			String data = query.getString(query
					.getColumnIndex(Audio.Media.DATA));
			String title = query.getString(query
					.getColumnIndex(Audio.Media.TITLE));
			String album = query.getString(query
					.getColumnIndex(Audio.Media.ALBUM));
			String mime_type = query.getString(query
					.getColumnIndex(Audio.Media.MIME_TYPE));
			String artist = query.getString(query
					.getColumnIndex(Audio.Media.ARTIST));
			String composer = query.getString(query
					.getColumnIndex(Audio.Media.COMPOSER));
			audio = new AudioBean(_id, display_name, duration, data, title,
					album, mime_type, artist, composer);
			list.add(audio);
			Log.i("zld", "SD��Ƶ"+_id+"=="+display_name+"=="+duration+"=="+data+"=="+title+"=="+album+"=="+mime_type+"=="+artist+"=="+composer);
		}
		return list;
	}

	// �����ڴ濨�е���Ƶ
	/**
	 * �����ڴ濨�е���Ƶ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<AudioBean> getAudioFileFromInternal(Context context) {
		ArrayList<AudioBean> list = new ArrayList<AudioBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Audio.Media.INTERNAL_CONTENT_URI,
				null, null, null, null);
		AudioBean audio = null;
		while (query.moveToNext()) {
			String _id = query.getString(query.getColumnIndex(Audio.Media._ID));
			String display_name = query.getString(query
					.getColumnIndex(Audio.Media.DISPLAY_NAME));
			String duration = query.getString(query
					.getColumnIndex(Audio.Media.DURATION));
			String data = query.getString(query
					.getColumnIndex(Audio.Media.DATA));
			String title = query.getString(query
					.getColumnIndex(Audio.Media.TITLE));
			String album = query.getString(query
					.getColumnIndex(Audio.Media.ALBUM));
			String mime_type = query.getString(query
					.getColumnIndex(Audio.Media.MIME_TYPE));
			String artist = query.getString(query
					.getColumnIndex(Audio.Media.ARTIST));
			String composer = query.getString(query
					.getColumnIndex(Audio.Media.COMPOSER));
			audio = new AudioBean(_id, display_name, duration, data, title,
					album, mime_type, artist, composer);
			list.add(audio);
			Log.i("zld", "�ڴ���Ƶ"+_id+"=="+display_name+"=="+duration+"=="+data+"=="+title+"=="+album+"=="+mime_type+"=="+artist+"=="+composer);
		}
		return list;
	}

	// ����SD���е���Ƶ
	/**
	 * ����SD���е���Ƶ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<VideoBean> getVideoFileFromExternal(Context context) {
		ArrayList<VideoBean> list = new ArrayList<VideoBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
				null, null, null, null);
		VideoBean video = null;
		while (query.moveToNext()) {
			String _id = query.getString(query.getColumnIndex(Video.Media._ID));
			String album = query.getString(query
					.getColumnIndex(Video.Media.ALBUM));
			String artist = query.getString(query
					.getColumnIndex(Video.Media.ARTIST));
			String data = query.getString(query
					.getColumnIndex(Video.Media.DATA));
			String description = query.getString(query
					.getColumnIndex(Video.Media.DESCRIPTION));
			String display_name = query.getString(query
					.getColumnIndex(Video.Media.DISPLAY_NAME));
			String duration = query.getString(query
					.getColumnIndex(Video.Media.DURATION));
			video = new VideoBean(_id, album, artist, data, description,
					display_name, duration);
			list.add(video);
			Log.i("zld", "SD��Ƶ"+_id+"=="+album+"=="+artist+"=="+data+"=="+description+"=="+display_name+"=="+duration);
		}
		return list;
	}

	// �������ݿ��е���Ƶ
	/**
	 * �����ڴ濨�е���Ƶ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<VideoBean> getVideoFileFromInternal(Context context) {
		ArrayList<VideoBean> list = new ArrayList<VideoBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI,
				null, null, null, null);
		VideoBean video = null;
		while (query.moveToNext()) {
			String _id = query.getString(query.getColumnIndex(Video.Media._ID));
			String album = query.getString(query
					.getColumnIndex(Video.Media.ALBUM));
			String artist = query.getString(query
					.getColumnIndex(Video.Media.ARTIST));
			String data = query.getString(query
					.getColumnIndex(Video.Media.DATA));
			String description = query.getString(query
					.getColumnIndex(Video.Media.DESCRIPTION));
			String display_name = query.getString(query
					.getColumnIndex(Video.Media.DISPLAY_NAME));
			String duration = query.getString(query
					.getColumnIndex(Video.Media.DURATION));
			video = new VideoBean(_id, album, artist, data, description,
					display_name, duration);
			list.add(video);
			Log.i("zld", "�ڴ���Ƶ"+_id+"=="+album+"=="+artist+"=="+data+"=="+description+"=="+display_name+"=="+duration);
		}
		return list;
	}

	// ����SD���е�ͼƬ
	/**
	 * ����SD���е�ͼƬ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<ImageBean> getImageFileFromExternal(Context context) {
		ArrayList<ImageBean> list = new ArrayList<ImageBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
				null, null, null, null);
		ImageBean image = null;
		while (query.moveToNext()) {
			String _id = query
					.getString(query.getColumnIndex(Images.Media._ID));
			String display_name = query.getString(query
					.getColumnIndex(Images.Media.DISPLAY_NAME));
			String description = query.getString(query
					.getColumnIndex(Images.Media.DESCRIPTION));
			String data = query.getString(query
					.getColumnIndex(Images.Media.DATA));
			String title = query.getString(query
					.getColumnIndex(Images.Media.TITLE));
			String mime_type = query.getString(query
					.getColumnIndex(Images.Media.MIME_TYPE));
			String size = query.getString(query
					.getColumnIndex(Images.Media.SIZE));
			String width = query.getString(query
					.getColumnIndex(Images.Media.WIDTH));
			String height = query.getString(query
					.getColumnIndex(Images.Media.HEIGHT));
			image = new ImageBean(_id, display_name, description, data, title,
					mime_type, size, width, height);
			list.add(image);
			Log.i("zld","SDͼƬ"+ _id+"=="+display_name+"=="+description+"=="+data+"=="+title+"=="+mime_type+"=="+size+"=="+width+"=="+height);
		}
		return list;
	}

	// �����ڴ濨�е�ͼƬ
	/**
	 * �����ڴ濨�е�ͼƬ
	 * 
	 * @param context
	 * @return
	 */
	public static ArrayList<ImageBean> getImageFileFromInternal(Context context) {
		ArrayList<ImageBean> list = new ArrayList<ImageBean>();
		ContentResolver resolver = context.getContentResolver();
		Cursor query = resolver.query(
				android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI,
				null, null, null, null);
		ImageBean image = null;
		while (query.moveToNext()) {
			String _id = query
					.getString(query.getColumnIndex(Images.Media._ID));
			String display_name = query.getString(query
					.getColumnIndex(Images.Media.DISPLAY_NAME));
			String description = query.getString(query
					.getColumnIndex(Images.Media.DESCRIPTION));
			String data = query.getString(query
					.getColumnIndex(Images.Media.DATA));
			String title = query.getString(query
					.getColumnIndex(Images.Media.TITLE));
			String mime_type = query.getString(query
					.getColumnIndex(Images.Media.MIME_TYPE));
			String size = query.getString(query
					.getColumnIndex(Images.Media.SIZE));
			String width = query.getString(query
					.getColumnIndex(Images.Media.WIDTH));
			String height = query.getString(query
					.getColumnIndex(Images.Media.HEIGHT));
			image = new ImageBean(_id, display_name, description, data, title,
					mime_type, size, width, height);
			list.add(image);
			Log.i("zld", "�ڴ�ͼƬ"+_id+"=="+display_name+"=="+description+"=="+data+"=="+title+"=="+mime_type+"=="+size+"=="+width+"=="+height);
		}
		return list;
	}
}
