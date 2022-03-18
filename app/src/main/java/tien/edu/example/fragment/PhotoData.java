package tien.edu.example.fragment;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 2,
                "http://images5.fanpop.com/image/polls/883000/883568_1321765454199_full.png"));
        photos.add(new Photo(1, 2,
                "https://tse1.mm.bing.net/th?id=OIP.dKUNNMtX0ZLrsjRYBIhfFAHaEe&pid=Api&P=0&w=260&h=157"));
        photos.add(new Photo(3, 1,
                "https://yt3.ggpht.com/a/AATXAJyDD3ODfe6kFCdyzx5ryUGjnYkhtbgeEzy9FuWv=s900-c-k-c0xffffffff-no-rj-mo"));
        photos.add(new Photo(4, 1,
                "https://quizizz.com/media/resource/gs/quizizz-media/quizzes/d140fc00-99a3-43c3-bb25-221844b2d380"));
        photos.add(new Photo(6, 0,
                "https://tse3.mm.bing.net/th?id=OIP.qZUVrRTeFTSRjHRfUmvBHwHaDt&pid=Api&P=0&w=325&h=162"));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for(int i = 0; i < phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Photo> getPhotosByCategory(int category){
        ArrayList<Photo> allPhotos = generatePhotoData();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for(int i = 0; i < allPhotos.size(); i++){
            if(allPhotos.get(i).getCategory() == category){
                photos.add(allPhotos.get(i));
            }
        }
        return photos;
    }
}
